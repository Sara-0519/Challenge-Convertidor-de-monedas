import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        TasaCambio tasas = consulta.obtenerTasas();
        Map<String, Double> rates = tasas.getConversion_rates();

        Scanner scanner = new Scanner(System.in);
        List<String> historial = new ArrayList<>();
        int opcion;

        do {
            System.out.println("""
                ***********************************************
                Sea bienvenido/a al Conversor de Moneda =]

                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Ver historial
                8) Salir

                Elija una opción válida:
                ***********************************************
                """);

            opcion = scanner.nextInt();
            double monto, resultado;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto en USD: ");
                    monto = scanner.nextDouble();
                    resultado = monto * rates.get("ARS");
                    System.out.println("Resultado: " + resultado + " ARS\n");
                    historial.add(monto + " USD = " + resultado + " ARS");
                    break;
                case 2:
                    System.out.print("Ingrese el monto en ARS: ");
                    monto = scanner.nextDouble();
                    resultado = monto / rates.get("ARS");
                    System.out.println("Resultado: " + resultado + " USD\n");
                    historial.add(monto + " ARS = " + resultado + " USD");
                    break;
                case 3:
                    System.out.print("Ingrese el monto en USD: ");
                    monto = scanner.nextDouble();
                    resultado = monto * rates.get("BRL");
                    System.out.println("Resultado: " + resultado + " BRL\n");
                    historial.add(monto + " USD = " + resultado + " BRL");
                    break;
                case 4:
                    System.out.print("Ingrese el monto en BRL: ");
                    monto = scanner.nextDouble();
                    resultado = monto / rates.get("BRL");
                    System.out.println("Resultado: " + resultado + " USD\n");
                    historial.add(monto + " BRL = " + resultado + " USD");
                    break;
                case 5:
                    System.out.print("Ingrese el monto en USD: ");
                    monto = scanner.nextDouble();
                    resultado = monto * rates.get("COP");
                    System.out.println("Resultado: " + resultado + " COP\n");
                    historial.add(monto + " USD = " + resultado + " COP");
                    break;
                case 6:
                    System.out.print("Ingrese el monto en COP: ");
                    monto = scanner.nextDouble();
                    resultado = monto / rates.get("COP");
                    System.out.println("Resultado: " + resultado + " USD\n");
                    historial.add(monto + " COP = " + resultado + " USD");
                    break;
                case 7:
                    System.out.println("\n--- Historial de conversiones ---");
                    if (historial.isEmpty()) {
                        System.out.println("Aún no hay conversiones registradas.");
                    } else {
                        for (String registro : historial) {
                            System.out.println(registro);
                        }
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.\n");
            }

        } while (opcion != 8);
    }
}

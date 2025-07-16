<p align="center">
  <img width="400" height="400" alt="image" src="https://github.com/user-attachments/assets/4f74887b-360d-408b-92b9-22029b8de715" />
</p>

# Conversor de Monedas en Java
Este es un proyecto en Java que implementa un **conversor de monedas** utilizando una API de tasas de cambio en tiempo real.
El programa permite al usuario seleccionar una moneda base y una moneda objetivo, ingresar una cantidad, y obtener el valor convertido.

## Características
- Interfaz de consola amigable
- Uso de la API [ExchangeRate-API](https://www.exchangerate-api.com/)
- Manejo de errores y validaciones
- Conversión automática entre múltiples monedas

## Estructura del Proyecto
- `Principal.java`: Contiene el método `main` y la lógica para interactuar con el usuario.
- `TasaCambio.java`: Representa la estructura de respuesta de la API, utilizada por la librería Gson.
- `ConsultaMoneda.java`: Se encarga de realizar la consulta HTTP a la API y obtener los datos de conversión.

## Requisitos
- Java 11 o superior
- Dependencia Gson (puedes usar Maven o agregar el `.jar` manualmente)

## Cómo usar
1. Clona este repositorio o descarga los archivos fuente.
2. Asegúrate de tener la librería Gson disponible en tu proyecto.
3. Ejecuta `Principal.java`.

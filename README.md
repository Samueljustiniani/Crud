# Proyecto CRUD en Java con Conexión a MySQL

Este proyecto es una aplicación CRUD (Crear, Leer, Actualizar, Borrar) que permite gestionar datos de estudiantes utilizando Java y Swing para la interfaz gráfica, así como conectarse a una base de datos MySQL para almacenar la información.

## Requisitos

- Java Development Kit (JDK) 8 o superior
- NetBeans IDE o cualquier IDE compatible con Java
- Biblioteca de conexión a MySQL (MySQL Connector/J)

## Estructura del Proyecto

- **CRUD.java**: Clase principal que inicia la aplicación.
- **Ventana2.java**: Clase que representa la segunda ventana de la aplicación, donde se ingresan y visualizan los datos de los estudiantes.
- **MySQLConection.java**: Clase principal para establecer la conexión a la base de datos MySQL.
- **conexion/conexion.java**: Clase encargada de gestionar la conexión a la base de datos MySQL.

## Funcionalidades

### Ventana1 (CRUD.java)

- **Registrar Estudiantes**: Permite ingresar datos de estudiantes.
- **Mostrar Datos**: Muestra los datos ingresados en la ventana secundaria.
- **Navegación**: Posibilidad de abrir la segunda ventana para ingresar más información sobre el estudiante.

### Ventana2 (Ventana2.java)

- **Edad**: Selección de edad mediante un spinner.
- **Año**: Selección del año mediante un slider.
- **Sexo**: Opción de seleccionar género (Hombre/Mujer) mediante radio buttons.
- **Carrera**: Selección de carrera mediante un combo box.
- **Ciclo**: Selección de ciclos disponibles mediante checkboxes.
- **Mostrar Datos**: Muestra todos los datos ingresados en un área de texto.

### Conexión a MySQL (MySQLConection.java y conexion/conexion.java)

- **Establecer Conexión**: Permite conectarse a una base de datos MySQL utilizando credenciales específicas.
- **Manejo de Errores**: Muestra un mensaje de éxito o error al intentar conectarse a la base de datos.

## Cómo Ejecutar el Proyecto

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en NetBeans o en el IDE de tu elección.
3. Asegúrate de tener el MySQL Connector/J en el classpath de tu proyecto.
4. Compila y ejecuta la clase `MySQLConection.java` para iniciar la conexión a la base de datos.

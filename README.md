# Laboratorio 3 Taller de Base de Datos

# Integrantes: 
* Enzo Gulppi
* Aritz Lamelas
* Alexandra Navarro
* Marcelo Godoy
* Javiera Vergara

# Descripción del proyecto:
La entrega de laboratorio consiste en realizar una aplicación solo de Backend en base a la descripción del proyecto entregado (Emergencia) con distintas funcionalidades según lo proyectado en dicho enunciado. Para esta entrega, se utiliza funcionalidades similares a la primera entrega del laboratorio 1, pero la gran diferencia en este caso con manejo de la base de datos No SQL (MongoDB), cuya base de datos nos ayudan a manejar de mejor manera la organización, administración y accesos a una gran cantidad de datos.

El backend es una REST API hecha en Java Spring Boot conectado con base de datos No Relacionales como MongoDB

# Descripción del repositorio:
El entregable se encuentra en este repositorio (link) y esta separado en 1 carpetas correspondiente a cada proyecto individual:
1. Backend

# Requisitos para ejecutar el proyecto:
Para ejecutar correctamente todo el proyecto, además de los archivos del repositorio se requieren las siguientes tecnologías:
1. Intellij IDEA Ultimate para ejecutar el Backend
2. Postman version +9.4
3. MongoDB Version 5.X.X
4. MongoDBCompass (que se instala junto con MongoDB)

# Instrucciones de instalación:
1. Clonamos el repositorio o lo descargamos mediante .zip
2. https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-windows/ link para instalar MongoDB Community Edition.
3. https://www.mongodb.com/try/download/compass link para instalar MongoDB Compass
4. https://www.jetbrains.com/idea/ link para instalar Intellij IDEA
5. Al abrir IntelliJ IDEA Ultimate, abrir un nuevo proyecto y seleccionar la carpeta Backend. Debemos esperar a que el proyecto se configure y se instalen los plugins necesarios.

# Instrucciones de uso:
Carga de datos: Utilizar el archivo Dump llamado "import.json" desde MongoDB Compass:
1. Seleccionamos la conexion de la base de datos
2. Crear una base de datos y una colección llamada voluntarios
3. Seleccionar añadir datos -> Importar un json
4. Seleccionar el archivo "import.json"
5. Confirmamos los datos a importar y listo
6. Para probar el CRUD de una tabla, debemos colocar la ruta en Postman (Por ejemplo, http://127.0.0.1:8080/voluntarios). Luego seleccionar uno de los métodos a aplicar, dependiendo de si quieres crear, mostrar, editar o eliminar un elemento y lo mismo para los otros casos.

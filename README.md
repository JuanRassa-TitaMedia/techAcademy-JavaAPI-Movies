# Ejercicio Tech Academy - Java - API Movies

Las consignas de este ejercicio son las siguientes:

1. Crear endpoints de Lectura, Creación, actualización y eliminación (CRUD) de "Movies".
2. Crearán un controlador con un método diferente para cada unos de los servicios.
3. La actividad me debe permitir crear "Movies" en la base, listarlas, actualizarlas y eliminarlas.

## Configuración
1.  Clonar el repositorio de acuerdo a la organización previamente sugerida.
2.  Contar con la instalación de Java y ejecutar el siguiente archivo "src/main/java/com/example/movies/MoviesApplication.java" para levantar el servidor.
3.  Para probar los endpoints puede ingresar al siguiente workspace de Postman: [Movies Endpoints API](https://www.postman.com/red-eclipse-229019/workspace/techacademy-titamedia-juanrassa/collection/17910418-e6be54cc-74f2-4467-9e2c-31edcbf880e2?action=share&creator=17910418) Importante hacer el uso de este workspace en el app de escritorio de Postman.
  - Primero debe acceder por el endpoint de /crearUsuario en la carpeta de Usuarios para generar un token. Dicho token luego debera copiarse en el header de "access-token" en el resto de peticiones. También puede copiarse como variable de entorno del workspace "CursoAPI-TechAcademy" para mayor comodidad.
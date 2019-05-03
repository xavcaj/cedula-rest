# Validación de Cedula en REST

## Introducción
Esta aplicación valida una cédula de ciudadanía ecuatoriana.
Se utiliza el framework [Spring Boot](https://spring.io/projects/spring-boot)
para implementar un servicio REST de validación.

## Requisitos
Se debe instalar OpenJDK 1.8 para compilar y ejecutar la aplicación.

## Compilar
Para compilar la aplicación se debe utilizar Apache Maven.
Se incluye un script para invocar Apache Maven desde la línea de comando.

En Windows:

    mvnw.cmd clean package

En Linux:

    ./mvnw clean package

## Ejecutar
Para ejecutar la aplicación se debe utilizar Java:

    java -jar target/cedula-rest-1.0.jar

Este comando inicia un servidor Web utilizando Spring Boot, que escucha en el puerto 8080.

## Probar
Para probar se puede usar un browser en Windows o curl en Linux.

Se debe acceder al URL http://localhost:8080/cedula/validar?cedula=xxxxxxxx

Por ejemplo:

    curl 'http://localhost:8080/cedula/validar?cedula=0704163575'

# Usar una imagen base de Java 17
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/agrotech_security-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
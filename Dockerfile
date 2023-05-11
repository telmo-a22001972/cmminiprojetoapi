FROM openjdk:17

COPY target/miniprojeto-api.jar miniprojeto-api.jar

ENTRYPOINT ["java", "-jar", "miniprojeto-api.jar"]
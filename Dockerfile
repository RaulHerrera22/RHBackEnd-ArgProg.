FROM eclipse-temurin:17-jdk-alpine
MAINTAINER RH
COPY target/RH-0.0.1-SNAPSHOT.jar RH-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/RH-0.0.1-SNAPSHOT.jar"]
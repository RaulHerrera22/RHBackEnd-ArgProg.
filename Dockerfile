# Build
FROM maven:3.8.5-openjdk-17-slim AS build
COPY . .
COPY pom.xml /home/app
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/RH-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

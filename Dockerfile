# Build
FROM maven:3.6.0-jdk-11-slim AS build
COPY . .
COPY pom.xml /home/app
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /target/RH-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

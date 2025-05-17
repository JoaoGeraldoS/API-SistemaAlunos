FROM maven:3.9.6-openjdk-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21
WORKDIR /app
COPY --from=build /app/target/talentos-proz-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
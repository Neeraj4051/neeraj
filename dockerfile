FROM openjdk:17-alpine
ADD target/example.jar example.jar
ENTERPOINT ["java","-jar","example.jar"]
EXPOSE 8080
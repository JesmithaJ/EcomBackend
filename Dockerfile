FROM openjdk:17
COPY target/todo-0.0.1-SNAPSHOT.jar product-0.0.1.jar
ENTRYPOINT ["java","-jar","/product-0.0.1.jar"]
EXPOSE 8080
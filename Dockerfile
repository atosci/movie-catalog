FROM openjdk:8-jre-alpine

Expose 8084

ADD target/movie-catalog-service-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java","-jar","movie-catalog-service-0.0.1-SNAPSHOT.jar"]

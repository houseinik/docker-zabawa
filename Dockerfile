FROM openjdk:21-ea-32-jdk-bullseye
ADD target/docker-zabawa-0.0.1-SNAPSHOT.jar .
EXPOSE 2137
CMD java -jar docker-zabawa-0.0.1-SNAPSHOT.jar
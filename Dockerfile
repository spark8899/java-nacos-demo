FROM docker.io/library/openjdk:17-jdk-bullseye
WORKDIR /opt/app
ADD target/nacos-config-demo-1.0-SNAPSHOT.jar /opt/app/server.jar

ENTRYPOINT ["java", "-jar", "/opt/app/server.jar"]

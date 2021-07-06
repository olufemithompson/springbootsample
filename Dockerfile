FROM openjdk:8-jdk-alpine
COPY target/sample-0.0.1-SNAPSHOT.jar sample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]
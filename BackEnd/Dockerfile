FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ADD ./target/imDay-0.0.1-SNAPSHOT.jar imday.jar
ENTRYPOINT ["java","-jar","/imday.jar"]
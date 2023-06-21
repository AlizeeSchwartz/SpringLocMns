FROM openjdk:17-alpine
COPY target/SpringLocMns-0.0.1-SNAPSHOT.jar ROOT.jar
ENTRYPOINT ["java", "-jar", "/ROOT.jar"]
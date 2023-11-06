FROM openjdk:17
COPY ./target/SPECalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPECalculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "org.example.main"]
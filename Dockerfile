#build
FROM maven:3.5-jdk-8-alpine
COPY ./ ./
RUN mvn package
COPY target/pharmacy-backend*.jar pharmacy-backend.jar
CMD ["java", "-jar", "./pharmacy-backend.jar"]
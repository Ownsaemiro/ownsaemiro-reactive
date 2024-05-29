FROM openjdk:17

WORKDIR /app

ARG JAR_PATH=./build/libs

COPY ${JAR_PATH}/backlog-0.0.1-SNAPSHOT.jar ./app.jar

CMD ["java", "-jar", "./app.jar"]

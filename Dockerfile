FROM openjdk:8-jdk-alpine

RUN groupadd --gid 5000 newuser \
    && useradd --home-dir /home/newuser --create-home --uid 5000 \
        --gid 5000 --shell /bin/sh --skel /dev/null newuser

EXPOSE 8080

ARG JAR_FILE=target/rest-webservices-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

USER newuser

ENTRYPOINT ["java", "-jar", "/app.jar"]

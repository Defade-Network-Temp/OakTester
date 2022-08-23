FROM azul/zulu-openjdk-debian:17-jre-headless

WORKDIR /defade
COPY Yokura/build/libs/yokura.jar yokura.jar

ENTRYPOINT ["java", "-jar", "yokura.jar"]
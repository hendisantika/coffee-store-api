FROM bellsoft/liberica-openjdk-debian:21
WORKDIR /usr/src/app
COPY target/coffee-store.jar .
EXPOSE 8090
CMD ["java", "-jar", "coffee-store.jar"]

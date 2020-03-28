FROM openjdk:8-jdk-alpine
ENV APP_FILE api-emulator-1.0.0.jar
ENV APP_HOME /usr/app
EXPOSE 8089
COPY target/output $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]

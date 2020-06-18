FROM openjdk:8u201-jdk-alpine

ENV APP_FILE api-emulator-1.0.0.jar
ENV HOME /usr/edgegallery
ENV UID=166
ENV GID=166
ENV USER_NAME=eguser
ENV GROUP_NAME=eggroup

## create own user and group
RUN apk update &&\
    apk add shadow &&\
    mkdir -p $HOME &&\
    groupadd -r -g $GID $GROUP_NAME &&\
    useradd -r -u $UID -g $GID -d $HOME $USER_NAME &&\
    chown -R $USER_NAME:$GROUP_NAME $HOME

COPY --chown=$USER_NAME:$GROUP_NAME target/output $HOME/

WORKDIR $HOME

## modify mode
RUN chmod 750 $HOME &&\
    chmod -R 550 $HOME/lib &&\
    chmod 550 $HOME/$APP_FILE &&\
    chmod -R 700 $HOME/data &&\
    mkdir -p -m 700 $HOME/ssl &&\
    mkdir -p -m 750 $HOME/log &&\
    chown -R $USER_NAME:$GROUP_NAME $HOME

USER $USER_NAME

EXPOSE 8089

ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]

# Copyright 2020 Huawei Technologies Co., Ltd.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

FROM openjdk:8u201-jdk-alpine

ENV APP_FILE api-emulator-1.0.0.jar
ENV HOME /usr/app
ENV UID=166
ENV GID=166
ENV USER_NAME=eguser
ENV GROUP_NAME=eggroup

RUN mkdir -p /usr/app
## create own user and group
RUN apk update &&\
    apk add shadow &&\
    mkdir -p $HOME &&\
    groupadd -r -g $GID $GROUP_NAME &&\
    useradd -r -u $UID -g $GID -d $HOME $USER_NAME &&\
    chown -R $USER_NAME:$GROUP_NAME $HOME


WORKDIR $HOME

## modify mode
RUN chmod 750 $HOME &&\
    mkdir -p -m 700 $HOME/ssl &&\
    mkdir -p -m 750 $HOME/log &&\
    chown -R $USER_NAME:$GROUP_NAME $HOME

COPY --chown=$USER_NAME:$GROUP_NAME target/output $HOME/

USER $USER_NAME

EXPOSE 8089

ENTRYPOINT ["sh", "-c"]
CMD ["exec java -Dlog4j2.formatMsgNoLookups=true -jar $APP_FILE"]
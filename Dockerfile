FROM openjdk:22-slim-bullseye

WORKDIR /home/java/app

RUN apt-get update && apt-get install -y openssl

EXPOSE 8080

CMD [ "tail", "-f", "/dev/null" ]
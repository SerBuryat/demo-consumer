FROM openjdk:17-jdk-alpine
ENV WD /usr/local/demo-consumer
WORKDIR $WD
COPY ./build/libs $WD
ENTRYPOINT java -jar -Dspring.kafka.bootstrap-servers=$KAFKA_SERVERS demo-consumer.jar
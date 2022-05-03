package ru.dawgg.demo1.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoKafkaConsumer {

  @KafkaListener(topics = "name", groupId = "demo")
  public void getMessage(String userName) {
    System.out.println("Hello " + userName);
  }
}

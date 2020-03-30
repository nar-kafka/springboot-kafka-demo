package com.nar.springbootkafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "springboot-kafka-test", groupId = "Group1")
    public void listenMessage(String message) {
        System.out.println("Received Messasge in group Group1: " + message);
    }
}

package com.stark.springbootkafkaconsumer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

        @KafkaListener(topics = "pawan--multi-topic", groupId = "group-id")
    public void recieveMessage(String message) {
        System.out.println("Received Messasge - " + message);
    }
}

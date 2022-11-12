package com.kafkademo.springbootkafkademo.kafka;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class KafkaProducer {

    Logger logger = Logger.getLogger(KafkaProducer.class.getName());
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
       logger.info(String.format("Message send %s", message));
        kafkaTemplate.send("demo", message);
    }
}

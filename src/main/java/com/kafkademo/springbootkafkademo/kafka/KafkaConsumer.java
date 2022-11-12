package com.kafkademo.springbootkafkademo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaConsumer {

    Logger logger = Logger.getLogger(KafkaConsumer.class.getName());

    @KafkaListener(topics = "demo", groupId = "myGroup")
    public void consume(String message) {
        logger.info("Message received -> %s");
    }
}

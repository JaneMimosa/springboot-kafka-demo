package com.kafkademo.springbootkafkademo.kafka;

import com.kafkademo.springbootkafkademo.payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class JsonKafkaConsumer {

    Logger logger = Logger.getLogger(JsonKafkaConsumer.class.getName());

    @KafkaListener(topics = "demo_json", groupId = "myGroup")
    public void consume(User user) {
        logger.info(String.format("Json message received -> %s", user.toString()));

    }
}

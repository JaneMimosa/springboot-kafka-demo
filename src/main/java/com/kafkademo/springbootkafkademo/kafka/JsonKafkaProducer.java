package com.kafkademo.springbootkafkademo.kafka;

import com.kafkademo.springbootkafkademo.payload.User;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class JsonKafkaProducer {

    Logger logger = Logger.getLogger(JsonKafkaProducer.class.getName());

    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User data) {

        logger.info(String.format("Message sent -> s%", data.toString()));
        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "demo_json")
                .build();

        kafkaTemplate.send(message);
    }
}

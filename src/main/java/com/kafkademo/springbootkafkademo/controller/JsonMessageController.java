package com.kafkademo.springbootkafkademo.controller;

import com.kafkademo.springbootkafkademo.kafka.JsonKafkaProducer;
import com.kafkademo.springbootkafkademo.payload.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
@NoArgsConstructor
@AllArgsConstructor
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
     public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}

package com.kafkademo.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.beans.BeanProperty;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaTopic() {
        return TopicBuilder.name("demo")
                .build();
    }

    @Bean
    public NewTopic javaJsonTopic() {
        return TopicBuilder.name("demo_json")
                .build();
    }
}

package com.thecoderstv.KafkaDeliveryBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME) // name of the topic
//                .partitions() // we can define how many partitions we want in topic
//                .replicas()   // we can define how many replica we want in partition
                .build();

    }
}

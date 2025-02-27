package com.thecoderstv.KafkaEndUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaEndUserConfig {
    @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME,groupId = AppConstants.GROUP_ID)
    public void updateLocationOfDeliveryBoy(String value){
        System.out.println(value);
    }
}

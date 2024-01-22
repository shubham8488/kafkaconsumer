package com.kafkaconsumer.kafkaconsumer.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Configuration
public class KafkaConfig {
	
	@KafkaListener(topics = "location-update-topic",groupId = "group-1")
	public void updateLocation(String location) {
		Logger logger=LoggerFactory.getLogger(KafkaConfig.class);
		System.out.println(location);
		logger.info(location);
	}

}

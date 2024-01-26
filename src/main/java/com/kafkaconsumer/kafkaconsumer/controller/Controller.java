package com.kafkaconsumer.kafkaconsumer.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {
	
	@GetMapping("/test")
	public ResponseEntity<?> test(){
		
		return new ResponseEntity<>(Map.of("Message","KafkaConsumer Test page loaded successfully"),HttpStatus.OK);
	}

}

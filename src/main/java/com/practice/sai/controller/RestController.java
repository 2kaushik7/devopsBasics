package com.practice.sai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Value("${greeting.value}")
	String greeting;

	@GetMapping
	public ResponseEntity<String> sendGreeting() {
		return new ResponseEntity<String>(greeting, HttpStatus.OK);
	}
}

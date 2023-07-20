package com.test.jenkins.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/")
	public ResponseEntity<String> index(){
		return ResponseEntity.ok("test222");
	}

}

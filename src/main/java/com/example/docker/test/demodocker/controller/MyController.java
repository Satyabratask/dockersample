package com.example.docker.test.demodocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MyController {

	@GetMapping(path = "/v1/test",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getTest() {
		return new ResponseEntity("I AM SUCCESS", HttpStatus.OK);
	}

}

package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
	
	@GetMapping("/")
	public ResponseEntity<String> sayHello()
	{
		return new ResponseEntity<String>("welcome co school service",HttpStatus.OK);
	}

}

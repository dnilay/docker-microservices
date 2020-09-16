package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;
import com.example.demo.repo.SchoolRepo;

@RestController
public class SchoolController {
	
	private SchoolRepo schoolRepo;
	
	
	public SchoolController(SchoolRepo schoolRepo) {
		super();
		this.schoolRepo = schoolRepo;
	}


	@GetMapping("/")
	public ResponseEntity<String> sayHello()
	{
		return new ResponseEntity<String>("welcome co school service",HttpStatus.OK);
	}
	@GetMapping("/schools")
	public ResponseEntity<Iterable<School>> getAllSchools()
	{
		return new ResponseEntity<Iterable<School>>(schoolRepo.findAll(),HttpStatus.OK);
	}
	
	

}

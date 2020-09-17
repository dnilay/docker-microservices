package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;
import com.example.demo.proxy.StudentServiceProxy;
import com.example.demo.repo.SchoolRepo;

@RestController
public class SchoolController {

	private SchoolRepo schoolRepo;
	private StudentServiceProxy studentServiceProxy;

	public SchoolController(SchoolRepo schoolRepo, StudentServiceProxy studentServiceProxy) {
		super();
		this.schoolRepo = schoolRepo;
		this.studentServiceProxy = studentServiceProxy;
	}

	@GetMapping("/")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("welcome co school service", HttpStatus.OK);
	}

	@GetMapping("/schools")
	public ResponseEntity<Iterable<School>> getAllSchools() {
		return new ResponseEntity<Iterable<School>>(schoolRepo.findAll(), HttpStatus.OK);
	}

	@GetMapping("/schools/{schoolName}")
	public ResponseEntity<Iterable<Object>> getStudentsBySchoolName(@PathVariable("schoolName") String schoolName) {
		return new ResponseEntity<Iterable<Object>>(studentServiceProxy.getAllStudentsBySchoolName(schoolName),HttpStatus.OK);

	}

}

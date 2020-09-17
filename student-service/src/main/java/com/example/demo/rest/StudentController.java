package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@RestController
@RequestMapping("/api")
public class StudentController {

	private StudentRepo studentRepo;

	public StudentController(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	@GetMapping("/students/{schoolName}")
	public ResponseEntity<Iterable<Student>> getStudentsBySchoolName(@PathVariable("schoolName")String schoolName)
	{
		return new ResponseEntity<Iterable<Student>>(studentRepo.findBySchoolName(schoolName),org.springframework.http.HttpStatus.OK);
	}
	
}

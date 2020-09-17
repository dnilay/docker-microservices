package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@SpringBootApplication
@EnableEurekaClient
public class StudentServiceApplication implements CommandLineRunner{

	private StudentRepo studentRepo;
	
	
	public StudentServiceApplication(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		studentRepo.save(new Student(UUID.randomUUID().toString(), "John", "Doe", "John@email.com", "ABC"));
		studentRepo.save(new Student(UUID.randomUUID().toString(), "Mary", "Public", "marry@email.com", "ABC"));
		studentRepo.save(new Student(UUID.randomUUID().toString(), "Stant", "Piter", "stant@email.com", "XYZ"));
		studentRepo.save(new Student(UUID.randomUUID().toString(), "Rahul", "Nimbal", "rahul@email.com", "XYZ"));
		
	}

}

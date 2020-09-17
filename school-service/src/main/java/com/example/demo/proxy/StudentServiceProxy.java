package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("student-service")
public interface StudentServiceProxy {
	
	@GetMapping("/api/students/{studentName}")
	public Iterable<Object> getAllStudentsBySchoolName(@PathVariable("studentName")String schoolName);

}

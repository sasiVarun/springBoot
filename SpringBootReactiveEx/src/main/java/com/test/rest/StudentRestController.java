package com.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Student;
import com.test.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/create")
	public Mono<Student> createStudent(@RequestBody Student student) 
	{
		return service.createStudent(student);
	}
	
	@GetMapping("/find/{id}")
	public Mono<Student> fetchOneStudent(@PathVariable Long id) 
	{
		return service.fetchOneStudent(id);
	}
	
	@GetMapping("/all")
	public Flux<Student> fetchAllStudents() 
	{
		return service.fetchAllStudents();
	}
	
	@DeleteMapping("/remove/{id}")
	public Mono<Void> removeStudent(@PathVariable Long id) 
	{
		return service.removeOneStudent(id);
	}
}

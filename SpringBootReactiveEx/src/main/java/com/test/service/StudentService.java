package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.entity.Student;
import com.test.repository.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class StudentService {

	@Autowired
	private StudentRepository repo;

	public Mono<Student> createStudent(Student s) {
		return repo.save(s);
	}

	public Mono<Student> fetchOneStudent(Long id) {
		return repo.findById(id).switchIfEmpty(Mono.empty());
	}

	public Flux<Student> fetchAllStudents() {
		return repo.findAll().switchIfEmpty(Flux.empty());
	}

	public Mono<Void> removeOneStudent(Long id) {
		return repo.deleteById(id);
	}

}

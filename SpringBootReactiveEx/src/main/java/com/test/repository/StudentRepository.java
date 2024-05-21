package com.test.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.test.entity.Student;

public interface StudentRepository  extends ReactiveMongoRepository<Student, Long>{

}

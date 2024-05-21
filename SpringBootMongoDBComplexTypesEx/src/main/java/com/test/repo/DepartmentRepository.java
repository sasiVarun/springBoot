package com.test.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.collection.Department;

public interface DepartmentRepository extends MongoRepository<Department, Integer> {

}

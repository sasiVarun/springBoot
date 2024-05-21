package com.test.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.collection.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

}

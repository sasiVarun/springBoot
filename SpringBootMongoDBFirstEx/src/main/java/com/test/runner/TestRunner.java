package com.test.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.collection.Employee;
import com.test.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setId("AA1234");
		emp.setEid(207);
		emp.setEname("KELLY");
		emp.setEsal(547.08);
		
		repo.save(emp);
	}
}

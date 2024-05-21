package com.test.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Department;
import com.test.entity.Employee;
import com.test.repo.DepartmentRepository;
import com.test.repo.EmployeeRepository;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	EmployeeRepository erepo;
	@Autowired
	DepartmentRepository drepo;
	@Override
	public void run(String... args) throws Exception {
		Department d1 = new Department(1501, "DEV");
		Department d2 = new Department(1502, "QA");
		
		drepo.save(d1);
		drepo.save(d2);
		
		Employee e1 = new Employee(10,"AJAY",d1);
		Employee e2 = new Employee(11,"BHASKAR",d1);
		Employee e3 = new Employee(12,"CHANDRA",d2);
		Employee e4 = new Employee(13,"DEEPAK",d2);
		
		erepo.saveAll(Arrays.asList(e1,e2,e3,e4));
		
		//------fetch data-------------
		erepo.fetchEmployeeByDept("DEV").forEach(System.out::println);
	}

}

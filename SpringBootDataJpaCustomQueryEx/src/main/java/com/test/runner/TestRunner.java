package com.test.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Employee;
import com.test.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(101, "AJAY", 200.00, "DEV");
		Employee e2 = new Employee(102, "SAM", 300.00, "QA");
		Employee e3 = new Employee(103, "SYED", 400.00, "BA");
		Employee e4 = new Employee(104, "RAJ", 500.00, "QA");
		repo.saveAll(Arrays.asList(e1,e2,e3,e4));
		
		/*
		 * repo.getEmpNames().forEach(System.out::println);
		 * 
		 * System.out.println("=================================");
		 * 
		 * repo.getEmpNameandSal() .stream() .map(obj->obj[0] + "-" + obj[1])
		 * .forEach(System.out::println);
		 * 
		 * System.out.println("=================================");
		 * 
		 * repo.getAllEmps().forEach(System.out::println);
		 */
		
//		repo.fetchEmpnamesByDept("QA").forEach(System.out::println);
		repo.getEmpsDeptData("QA").forEach(System.out::println);
	}

}

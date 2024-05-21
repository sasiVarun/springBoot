package com.test.runner;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.collection.Address;
import com.test.collection.Department;
import com.test.collection.Employee;
import com.test.collection.Profile;
import com.test.repo.DepartmentRepository;
import com.test.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Autowired
	private DepartmentRepository drepo;
	@Override
	public void run(String... args) throws Exception {
		
		Department d1 = new Department(2128, "DEV");
		drepo.save(d1);
		
		repo.save(new Employee(109, "BINOD", 
				Arrays.asList("P1", "P2", "P3"),
				Map.of("C1", "ABC", "C2", "DEF"),
				new Address("9/48", "Hyderabad"),
				Arrays.asList(new Profile("PF1", "AA"), new Profile("PF2", "AB")),
				d1
				)
				);
	}

}

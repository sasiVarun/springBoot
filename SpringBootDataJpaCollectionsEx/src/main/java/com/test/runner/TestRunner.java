package com.test.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Employee;
import com.test.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		List<String> list = Arrays.asList("1A","2B");
		Set<String> set = Set.of("P1","P2");
		Map<String,String> map = new HashMap<>();
		map.put("C1", "ABC");
		map.put("C2", "DEF");
		
		Employee emp = new Employee(101, "AJAY", list, set, map);
		
		repo.save(emp);
	}

}

package com.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	
	@GetMapping("/fetch")
	@ResponseBody
	public Employee getOneEmployee() {
		return new Employee(101,"AA",220.91);
	}
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody Employee emp) {
		return "Data is " + emp.toString();
	}
	
	@GetMapping("/fetch/{eid}")
	public String getEmployeeById(@PathVariable Integer eid) {
		return "Fetching Emp " + eid;
	}
}

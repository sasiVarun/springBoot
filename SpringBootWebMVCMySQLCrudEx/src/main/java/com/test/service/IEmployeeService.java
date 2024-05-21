package com.test.service;

import java.util.List;

import com.test.entity.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee emp);
	
	List<Employee> getAllEmployees();
	
	Employee getOneEmployee(Integer Id);
	
	void deleteEmployee(Integer id);
	
	void updateEmployee(Employee emp);

}

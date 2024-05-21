package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Employee;
import com.test.repo.EmployeeRepository;
import com.test.service.IEmployeeService;

@Service //Calculation, Operations, Transaction Management etc...
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(Employee emp) {
		return repo.save(emp).getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getOneEmployee(Integer Id) {
		return repo.findById(Id).get();
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	
	
}

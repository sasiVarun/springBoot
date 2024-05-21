package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	/* SELECT e.empName 
	 * FROM Employee e 
	 * 		INNER JOIN 
	 * 	e.dob as dept 
	 * WHERE dept.deptName=?
	 */
	
	@Query("SELECT e.empName FROM Employee e INNER JOIN e.dob as dept WHERE dept.deptName=:dname")
	List<String> fetchEmployeeByDept(String dname);

}

package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//select 1 column => List<Datatype>
//	@Query("select e.empName from Employee e") // select, from in upper or lower case both are valid
	@Query("SELECT e.empName FROM Employee e")
	List<String> getEmpNames();
	
	//select >1 column => List<Object[]>
	@Query("select e.empName, e.empSal from Employee e")
	List<Object[]> getEmpNameandSal();
	
	//select all columns => List<T>
	//@Query("SELECT e FROM Employee e") valid query
	@Query("FROM Employee e")
	//@Query("SELECT * FROM Employee e") INVALID * means multiply
	List<Employee> getAllEmps();
	
	//---------------------Passing Input---------------------------
	@Query("SELECT e.empName FROM Employee e WHERE e.empDept=:dept")
	List<String> fetchEmpnamesByDept (String dept);

	//---------------------Pure SQL {JDBC Style}---------------------------
	@Query(value="select ename from emptab where edept = ?1", nativeQuery=true)
	List<String> getEmpsDeptData (String dept);
	

}

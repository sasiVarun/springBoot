package com.test.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@GetMapping("/show")
	public ResponseEntity<String> showMsg(){
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	
	@GetMapping("/findOne")
	public ResponseEntity<Employee> showEmployee(){
		return new ResponseEntity<Employee>(new Employee(101,"AA",550.90),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody Employee employee){
		return new ResponseEntity<String>(employee.toString(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateData(@RequestBody Employee employee){
		return new ResponseEntity<String>(employee.toString(), HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteData(@PathVariable Integer id){
		return new ResponseEntity<String>("Deleted with id !" + id, HttpStatus.OK);
	}
}

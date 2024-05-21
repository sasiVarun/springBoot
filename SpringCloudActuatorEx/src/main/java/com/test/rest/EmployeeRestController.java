package com.test.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	
	@GetMapping("/data")
	public ResponseEntity<String> showData(){
		return ResponseEntity.ok("Hello..!");
	}
}

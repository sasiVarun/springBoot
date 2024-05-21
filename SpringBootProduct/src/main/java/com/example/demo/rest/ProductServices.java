package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductServices {
	
	@GetMapping("/service")
	public ResponseEntity<String> showProductMsg() {
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
}

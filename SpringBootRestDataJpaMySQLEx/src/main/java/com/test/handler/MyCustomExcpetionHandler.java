package com.test.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.test.exception.ProductNotFoundException;

@RestControllerAdvice
public class MyCustomExcpetionHandler {
	
	// 1 exception type = 1 method
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException pnfe){
		return new ResponseEntity<String>(pnfe.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR); // 500
	}
}

package com.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.consumer.ProductRestConsumer;

@RestController
@RequestMapping("/order")
public class OrderControllerService {
	@Autowired
	private ProductRestConsumer consumer;
	
	@GetMapping("/data")
	public ResponseEntity<String> findDetails(){
		ResponseEntity<String> response = consumer.showProductMsg();
		return new ResponseEntity<String>("FROM ORDER..!! " + response.getBody(),HttpStatus.OK);
	}

}

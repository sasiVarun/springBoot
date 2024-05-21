package com.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.consumer.ProductConsumer;

@RestController
@RequestMapping("/order")
public class OrderControllerService {
	
	@Autowired
	private ProductConsumer consumer;
	
	@GetMapping("/show")
	public ResponseEntity<String> showMsg(){
		String data = consumer.getDataFromProduct();
		return new ResponseEntity<String>("FROM ORDER !!" + data,HttpStatus.OK);
	}

}

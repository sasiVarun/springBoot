package com.test.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RefreshScope
public class ProductRestController {
	
	@Value("${server.port}")
	private String port;
	
	@Value("${my.app.title}")
	private String title;
	
	@GetMapping("/data")
	public ResponseEntity<String> showMsg(){
		return new ResponseEntity<String>("Hello..!" + port, HttpStatus.OK);
	}
	
	@GetMapping("/config")
	public ResponseEntity<String> showConfig(){
		return new ResponseEntity<String>("FROM PRODUCT-SERVER -> " + title,HttpStatus.OK);
	}

}

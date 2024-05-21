package com.test.runner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class TestPutCallRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		
		// 1. Define one String URL
		String url = "http://localhost:8081/employee/update";
		
		//2. Create Rest Template Object
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		String json = "{\"empId\":10, \"empName\":\"Ajay\"}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(json, headers);
		
		//3. make call
		 ResponseEntity<String> res = rt.exchange(url, HttpMethod.PUT, requestEntity, String.class);
		 
		//4. Print response
		System.out.println("Body:" + res.getBody());
		System.out.println("Staus Code:" + res.getStatusCodeValue());
		System.out.println("Status Code Name:" + res.getStatusCode().name());
		System.out.println("Headers:" + res.getHeaders());
		
	}
}

package com.test.runner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestDeleteCallRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		
		// 1. Define one String URL
		String url = "http://localhost:8081/employee/remove/101";
		
		//2. Create Rest Template Object
		RestTemplate rt = new RestTemplate();

		//3. execute request and get response
		 ResponseEntity<String> res = rt.exchange(url, HttpMethod.DELETE, null, String.class);
		 
		//4. Print response
		System.out.println("Body:" + res.getBody());
		System.out.println("Staus Code:" + res.getStatusCodeValue());
		System.out.println("Status Code Name:" + res.getStatusCode().name());
		System.out.println("Headers:" + res.getHeaders());
		
	}
}

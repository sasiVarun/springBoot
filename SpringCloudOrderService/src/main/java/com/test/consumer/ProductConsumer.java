package com.test.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String getDataFromProduct() {
		// 1. Goto Eureka to get Microservice details(serviceInstance)
		ServiceInstance serviceInstance = client.choose("PRODUCT-SERVICE");
		
		// 2. read URI(IP/PORT) and make URL by adding path
		String url = serviceInstance.getUri() + "/product/data";
		
		// 3. Use RestTemplate and make call
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		
		return response.getBody();
	}

}

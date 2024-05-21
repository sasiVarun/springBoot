package com.test.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PRODUCT-SERVICE")
public interface ProductRestConsumer {
	
	@GetMapping("/product/data")
	public ResponseEntity<String> showProductMsg();
}

package com.test.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RoutingConfig {
	
//	@Bean
//	public RouteLocator gatewayConfig(RouteLocatorBuilder builder) {
//		
//		return builder.routes()
//				//.route("anyId", r->r.path("").uri(""))
//				.route("employeeId", r->r.path("/employee/**").uri("http://192.168.0.1:8081"))
//				.route("productId", r->r.path("/product/**").uri("lb:/PRODUCT-SERVICE"))
//				.build();
//	}

}

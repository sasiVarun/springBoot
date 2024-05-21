package com.test.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudRoutingConfig {
	
	// RouteLocator = list of routes --> 1 route = 1 microservice
	@Bean
	public RouteLocator configRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				//1 route --> 1 microservice
				.route("employeId", r->r.path("/employee/**").uri("lb://SPRING-CLOUD-EMPLOYEE-SERVICE"))
				.build();
	}

}

package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootConfigPropsExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootConfigPropsExApplication.class, args);
		
		Object ob = context.getBean("productData");
		System.out.println(ob.toString());
	}
}

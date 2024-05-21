package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstExApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootFirstExApplication.class, args);
		Object ob = ac.getBean("myDataSource");
		System.out.println(ob.toString());
	}
}

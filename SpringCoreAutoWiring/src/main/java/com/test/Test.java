package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee obj = context.getBean("eob",Employee.class);
		System.out.println(obj);
		context.close();
	}
}

package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		ac.scan("com.test"); // find classes
//		ac.refresh(); // create all objects for Classes found
		
		// read object from container
		Object ob = ac.getBean("emailSender");
		System.out.println(ob);
	}
}

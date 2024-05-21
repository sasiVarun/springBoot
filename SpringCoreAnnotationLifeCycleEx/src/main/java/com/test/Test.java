package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object ob = context.getBean("emailSender");
		System.out.println(ob);
		
		context.close();
	}

}

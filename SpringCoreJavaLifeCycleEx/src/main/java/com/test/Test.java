package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmailService es = context.getBean("esObj",EmailService.class);
		System.out.println(es);
		context.close();
	}

}

package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Object ob = context.getBean("esObj");
		System.out.println(ob);
		
		context.close();
	}

}

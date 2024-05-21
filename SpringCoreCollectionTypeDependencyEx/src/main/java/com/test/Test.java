package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Product product = context.getBean("prod",Product.class);
		System.out.println(product.toString());
		
		System.out.println(product.getColors().getClass().getName());
		System.out.println(product.getCost().getClass().getName());
		System.out.println(product.getData().getClass().getName());
		System.out.println(product.getInfo().getClass().getName());
	}
}

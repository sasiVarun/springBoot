package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("----------- Container is Created -----------------------");
		Object db1 = context.getBean("databaseCon");
		Object db2 = context.getBean("databaseCon");
		Object db3 = context.getBean("databaseCon");
		
		System.out.println(db1.hashCode());
		System.out.println(db2.hashCode());
		System.out.println(db3.hashCode());
		
		Object t1 = context.getBean("tokenService");
		Object t2 = context.getBean("tokenService");
		Object t3 = context.getBean("tokenService");
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
	}

}

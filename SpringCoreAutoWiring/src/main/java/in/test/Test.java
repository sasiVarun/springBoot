package in.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService obj = context.getBean("empService", EmpService.class);
		System.out.println(obj);
	}

}

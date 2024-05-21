package in.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		ac.scan("in.cg");
//		ac.refresh();
		
		Object ob = ac.getBean("dbCon");
		System.out.println(ob);
	}
	
}

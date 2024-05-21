package in.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		Object ob = context.getBean("pob");
		System.out.println(ob.toString());
	}
}

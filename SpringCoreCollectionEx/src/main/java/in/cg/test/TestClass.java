package in.cg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("mybeans.xml");
		Object ob = ac.getBean("pob");
		System.out.println(ob.toString());
	}

}

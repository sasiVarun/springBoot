package com.test.runner;

import java.io.FileInputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Employee;
import com.test.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\samaddi\\Downloads\\Cheetah.jpg");
		byte[] img = new byte[fis.available()];
		fis.read(img);
		
		String sample = "Hi I am sample test, Thanks for eading this message...!,Hi I am sample test, Thanks for eading this message...!,Hi I am sample test, Thanks for eading this message...!,Hi I am sample test, Thanks for eading this message...!,Hi I am sample test, Thanks for eading this message...!,";
		char[] desc = sample.toCharArray() ;
		
		repo.save(new Employee(101,"SAM", new Date(), new Date(), new Date(), img,desc));
		fis.close();
	}

}

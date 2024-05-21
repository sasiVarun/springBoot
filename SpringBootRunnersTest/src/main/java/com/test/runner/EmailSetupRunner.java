package com.test.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(69)
public class EmailSetupRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From Email Runner..!");
	}
}

package com.test.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {
	
	@Value("${my.app.db}")
	private String database;

	public void run(String... args) throws Exception {
		System.out.println(database);
	}

}

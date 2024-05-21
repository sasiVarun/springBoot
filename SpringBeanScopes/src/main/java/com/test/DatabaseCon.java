package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy
public class DatabaseCon {
	
	@Value("oracle")
	private String driver;
	
	@Value("jdbc-orcl")
	private String url;
	
	public DatabaseCon() {
		System.out.println("Database Connection created....");
	}

	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + "]";
	}
}

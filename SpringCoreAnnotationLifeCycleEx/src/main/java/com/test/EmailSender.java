package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

	@Value("ftps")
	private String host;

	@Value("678")
	private String port;

	public EmailSender() {
		super();
		System.out.println("From Constructor");
	}

	@PostConstruct
	public void setup() {
		System.out.println("From INIT");
	}

	@PreDestroy
	public void clear() {
		System.out.println("From Destroy");
	}

	@Override
	public String toString() {
		return "EmailSender [host=" + host + ", port=" + port + "]";
	}

}

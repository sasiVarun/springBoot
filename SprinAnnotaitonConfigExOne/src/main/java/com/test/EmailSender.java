package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("esObj")
@Component
public class EmailSender {
	
	@Value("gmail")
	private String host;
	
	@Value("567")
	private String port;

	@Override
	public String toString() {
		return "EmailSender [host=" + host + ", port=" + port + "]";
	}

}

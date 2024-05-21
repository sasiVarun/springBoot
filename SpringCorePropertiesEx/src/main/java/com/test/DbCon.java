package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbCon {
	
	@Value("${my.app.driver}")
	private String dc;
	
	@Value("${my.app.url}")
	private String url;

	@Override
	public String toString() {
		return "DbCon [dc=" + dc + ", url=" + url + "]";
	}
}

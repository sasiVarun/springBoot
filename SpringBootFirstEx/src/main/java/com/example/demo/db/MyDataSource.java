package com.example.demo.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
	@Value("${my.app.driver-name}")
	private String driver;
	
	@Value("${my.app.url}")
	private String url;
	
	@Value("${my.app.username}")
	private String username;
	
	@Value("${my.app.pwd}")
	private String pwd;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "MyDataSource [driver=" + driver + ", url=" + url + ", username=" + username + ", pwd=" + pwd + "]";
	}
}

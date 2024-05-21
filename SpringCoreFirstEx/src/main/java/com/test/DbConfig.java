package com.test;

public class DbConfig {
	private String driver;
	private String url;

	public DbConfig() {
		super();
		System.out.println("Default Constructor");
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
		System.out.println("Inside driver setter");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		System.out.println("Inside url setter");
	}

	@Override
	public String toString() {
		return "DbConfig [driver=" + driver + ", url=" + url + "]";
	}

}

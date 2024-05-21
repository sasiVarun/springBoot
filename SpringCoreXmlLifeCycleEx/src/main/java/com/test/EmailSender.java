package com.test;

public class EmailSender {

	private String host;
	private String port;

	public EmailSender() {
		super();
		System.out.println("From Constructor");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		System.out.println("From Setter");
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "EmailSender [host=" + host + ", port=" + port + "]";
	}
	
	public void setup() {
		System.out.println("From INIT");
	}
	
	public void destroy() {
		System.out.println("From Destroy");
	}
}

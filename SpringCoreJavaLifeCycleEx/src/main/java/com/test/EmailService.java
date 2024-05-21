package com.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmailService implements InitializingBean, DisposableBean {
	private String host;
	private String port;

	public String getHost() {
		return host;
	}
	public void setHost(String host) {
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
		return "EmailService [host=" + host + ", port=" + port + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("From Destroy Method annotation");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From Init method annotation");
	}

}

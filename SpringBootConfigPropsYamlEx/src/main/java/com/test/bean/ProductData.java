package com.test.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties(prefix = "my.app")
@Setter
@ToString
public class ProductData {
	
	private Integer pid;
	private String pcode;
	private Double pcost;
	
	private List<String> models;
	private Map<String,String> info;
	
	private Vendor vob;

}

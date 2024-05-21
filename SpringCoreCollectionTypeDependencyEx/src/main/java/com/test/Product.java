package com.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter //Generates Setter methods
@Getter //Generates getter methods
@ToString //Generates toString method
@NoArgsConstructor // Generates zero-parameter constructor

public class Product {
	private int pid;
	private String pcode;
	private Set<String> colors;
	private List<Integer> cost;
	
	private Map<String,String> data;
	private Properties info;
}

package com.test.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Student {
	
	@Id
	private Long sid;
	private String sname;
	private Double sfee;

}

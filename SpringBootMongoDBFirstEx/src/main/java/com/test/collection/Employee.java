package com.test.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "employee") // optional
public class Employee {
	@Id
	private String id; //recommended to specify PK
	
	private Integer eid;
	private String ename;
	private Double esal;
}

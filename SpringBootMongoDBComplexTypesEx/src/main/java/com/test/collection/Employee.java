package com.test.collection;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employeeComplex")
public class Employee {
	@Id
	private Integer id;
	private String name;
	private List<String> projects;
	private Map<String, String> clients;
	
	private Address address;
	private List<Profile> profiles;
	
	@DBRef
	private Department dept;
	
}

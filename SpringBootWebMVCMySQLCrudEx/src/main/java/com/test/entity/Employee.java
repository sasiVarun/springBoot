package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) // If we don't know the db then we can use this 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for MySQL DB
	@Column(name = "eid")
	private Integer empId;
	
	@Column(name = "ename")
	private String empName;
	
	@Column(name = "esal")
	private Double empSal;
	
	@Column(name = "edept")
	private String empDepartment;
	
	@Column(name = "egen")
	private String empGender;
	
	@Column(name = "eaddr")
	private String empAddress;
}

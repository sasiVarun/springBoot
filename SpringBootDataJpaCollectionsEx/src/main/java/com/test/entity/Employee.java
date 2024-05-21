package com.test.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
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
	@Column(name="eid")
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@ElementCollection
	@CollectionTable(name="emp_versions", // Child table name
					joinColumns=@JoinColumn(name="eid") //Foreign Key Column Name
					)
	@Column(name="eversion") // element column
	@OrderColumn(name="position") // index column for List
	private List<String> versions;
	
	@ElementCollection
	@CollectionTable(name="emp_projs", // Child table name
					 joinColumns=@JoinColumn(name="eid") //Foreign Key Column Name
					)
	@Column(name="proj")// element column
	private Set<String> projects;
	
	@ElementCollection
	@CollectionTable(name="emp_clients", // Child table name
					joinColumns=@JoinColumn(name="eid") //Foreign Key Column Name
					)
	@MapKeyColumn(name="ckey") // index column for Map
	@Column(name="cname")// element column
	private Map<String, String> clients;
}

package com.test.model;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="userstab")
public class User {
	@Id
	@Column(name="uid")
	@GeneratedValue
	private Integer uid;
	
	@Column(name="uname")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pwd")
	private String password;
	
	@ElementCollection
	@CollectionTable(name="rolestab", // table name
					joinColumns = @JoinColumn(name="uid"))// key column
	@Column(name="role") // element column
	private List<String> roles;
}

package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="admintab")
public class Admin {
	
	@Id
	@Column(name="aid")
	private Integer adminId;
	
	@Column(name="aname")
	private String adminName;
	
	@Column(name="acode")
	private String adminCode;
}

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
@Table(name="modeltab")
public class Model {
	
	@Id
	@Column(name="mid")
	private Integer modelId;
	
	@Column(name="mname")
	private String modelName;

}

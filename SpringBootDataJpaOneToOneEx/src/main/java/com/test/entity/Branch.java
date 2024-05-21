package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="branchtab")
public class Branch {
	
	@Id
	@Column(name="bid")
	private Integer branchId;
	
	@Column(name="bname")
	private String branchName;
	
	@OneToOne
	@JoinColumn(name="aidFk")
	private Admin aob;
}

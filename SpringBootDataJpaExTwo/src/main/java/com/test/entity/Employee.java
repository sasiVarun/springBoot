package com.test.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@Column(name="edob")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name="eslot_time")
	@Temporal(TemporalType.TIME)
	private Date slotTime;
	
	@Column(name="ejoin_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfJoining;
	
	@Column(name="eimg")
	@Lob // BLOB
	private byte[] empImg;
	
	@Column(name="edesc")
	@Lob //CLOB
	private char[] empDesc;
}

package com.shiva.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@Column(name="Employee_Name")
	private String name;
	
	@Column(name="Employee_Age")
	private int age;
	
	@NotNull
	@PrimaryKeyJoinColumn
	@Column(name="Employee_ID")
	private Long empId;
	
	@Column(name="Employee_Dept")
	private String dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, Long empId, String dept) {
		
		this.name = name;
		this.age = age;
		this.empId = empId;
		this.dept = dept;
	}
	
	
	
	
}

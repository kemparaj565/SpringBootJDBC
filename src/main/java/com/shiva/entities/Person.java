package com.shiva.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Person")
/*@NamedQuery(name="findAll" , query="select * from employee a , person b where a.empid=b.empid ")*/
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@Column(name="Person_Name")
	private String name;
	
	@Column(name="Person_Age")
	private int age;
	
	@NotNull
	@PrimaryKeyJoinColumn
	@Column(name="Person_EmpID")
	private Long empId;

	public Person() {
		super();
		
	}

	public Person(String name, int age, Long empId) {
		super();
		this.name = name;
		this.age = age;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Long getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", empId=" + empId
				+ "]";
	}
	
	
	
	
	
	
}

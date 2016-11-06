package com.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.entities.Employee;
import com.shiva.entities.Person;
import com.shiva.repositories.EmployeeRepository;
import com.shiva.repositories.PersonRepository;

@RestController
@RequestMapping("/mixed")
public class MixedRepository {

	@Autowired
	PersonRepository rep;
	
	@Autowired
	EmployeeRepository erep;
	
	@RequestMapping("/mPersonData")
	public List<Person> allD(){
		
		return rep.find();
	}
	
	@RequestMapping("/mEmployeeData")
	public List<Employee> allEmployeeData(){
		
		return erep.customQueries();
	}
}

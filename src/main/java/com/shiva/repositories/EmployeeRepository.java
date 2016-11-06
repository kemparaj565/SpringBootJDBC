package com.shiva.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.shiva.entities.Employee;

@Repository
@RepositoryRestResource(path="employee" , collectionResourceRel="employee")
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	
	public List<Employee> findAll();
	
	@Query(value="select * from employee a , Person b where b.empId=5155",nativeQuery=true)
	public List<Employee> customQueries;
}

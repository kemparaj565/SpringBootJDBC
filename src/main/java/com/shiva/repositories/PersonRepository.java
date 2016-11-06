package com.shiva.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.shiva.entities.Person;

@Repository
@RepositoryRestResource(collectionResourceRel="person" ,  path="person")
public interface PersonRepository extends CrudRepository<Person,Long>{

	public List<Person> findByEmpId(Long id);
	
	@Query(value="select * from employee a , person b where a.Employee_ID=b.Person_EmpID",nativeQuery=true)
	public List<Person> find();
}

package com.shiva;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shiva.entities.Employee;
import com.shiva.entities.Person;
import com.shiva.repositories.EmployeeRepository;
import com.shiva.repositories.PersonRepository;

@ComponentScan
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class MainApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(MainApplication.class);
	}

	//@Autowired
	//@Qualifier("PersonRepository")
	
	
	@Bean
	public String dataAdd(PersonRepository repo){
		repo.save(new Person("Shankara", 12, 55L));
		repo.save(new Person("Shiva",55,5150L));
		repo.save(new Person("Shiva1",5,5151L));
		repo.save(new Person("Shiva5",45,5155L));
		repo.save(new Person("Shiva7",65,5165L));
		repo.save(new Person("Shiva8",75,5185L));
		repo.save(new Person("Shiva9",85,5915L));
		
		
		
		
		return "X";
	}
	
	@Bean
	public String dataAd(EmployeeRepository repo){
repo.save(new Employee("Shankara", 12, 55L,"1234"));
repo.save(new Employee("Shambo",99,5150L,"212"));
repo.save(new Employee("Shambo1",9,5151L,"212"));
repo.save(new Employee("Shambo3",29,51350L,"217"));
repo.save(new Employee("Shambo6",59,5175L,"215"));
repo.save(new Employee("Shambo7",69,5150L,"212"));
repo.save(new Employee("Shambo8",79,5150L,"214"));




		return "X";
	}
	
	@Bean
	public String callMethods(PersonRepository repo){
		List<Person> l=repo.find();
		for(Person p:l){
			log.info(" Person ",p);
		}
		return "Shiva";
	}

}

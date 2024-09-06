package com.learnSpring.mvcCrud;

import com.learnSpring.mvcCrud.dao.EmployeeRepository;
import com.learnSpring.mvcCrud.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MvcCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcCrudApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return runner -> {
			getEmployees(employeeRepository);
		};
	}

	public void getEmployees(EmployeeRepository employeeRepository) {
		List<Employee> employees = employeeRepository.findAll();
		for (Employee emp: employees) {
			System.out.println(emp);
		}
	}


}

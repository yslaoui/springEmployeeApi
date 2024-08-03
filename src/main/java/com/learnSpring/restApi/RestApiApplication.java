package com.learnSpring.restApi;

import com.learnSpring.restApi.dao.EmployeeRepository;
import com.learnSpring.restApi.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return runner -> {
			getEmployees(employeeRepository);
			System.out.println("Hi");
		};
	}

	public void getEmployees(EmployeeRepository employeeRepository) {
		List<Employee> employees = employeeRepository.findAll();
		for (Employee emp: employees) {
			System.out.println(emp);
		}
	}


}

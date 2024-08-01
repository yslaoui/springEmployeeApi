package com.learnSpring.restApi;

import com.learnSpring.restApi.dao.EmployeeDAO;
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
	CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO) {
		return runner -> {
			getEmployees(employeeDAO);
		};
	}

	public void getEmployees(EmployeeDAO dao) {
		List<Employee> employees = dao.findAll();
		for (Employee emp: employees) {
			System.out.println(emp);
		}
	}


}

package com.learnSpring.restApi.dao;

import com.learnSpring.restApi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

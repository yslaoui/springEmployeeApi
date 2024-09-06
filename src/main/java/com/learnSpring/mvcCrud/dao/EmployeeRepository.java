package com.learnSpring.mvcCrud.dao;

import com.learnSpring.mvcCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

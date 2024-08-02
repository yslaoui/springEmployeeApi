package com.learnSpring.restApi.dao;

import com.learnSpring.restApi.entity.Employee;
import com.learnSpring.restApi.service.EmployeeService;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}


//findById (argument id, returns Employee)
//Save Employee (takes Mployee as argument and returns an Employee object)
//Delete byId, returns void

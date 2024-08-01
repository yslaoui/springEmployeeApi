package com.learnSpring.restApi.service;

import com.learnSpring.restApi.dao.EmployeeDAO;
import com.learnSpring.restApi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements  EmployeeService{

    EmployeeDAO employeeDAO;

    public EmployeeServiceImplementation(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }
}

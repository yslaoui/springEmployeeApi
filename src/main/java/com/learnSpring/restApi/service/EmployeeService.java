package com.learnSpring.restApi.service;

import com.learnSpring.restApi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}

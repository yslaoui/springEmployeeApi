package com.learnSpring.restApi.dao;

import com.learnSpring.restApi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}

package com.learnSpring.restApi.service;

import com.learnSpring.restApi.dao.EmployeeRepository;
import com.learnSpring.restApi.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements  EmployeeService{

    EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {

        Optional<Employee> employeeOptional = this.employeeRepository.findById(id);
        Employee employee = null;
        if (employeeOptional.isPresent()) {
            employee =  employeeOptional.get();
        }
        else {
            throw new RuntimeException("employee with id " + id + "Not found");
        }
        return  employee;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        this.employeeRepository.deleteById(id);
    }
}

package com.learnSpring.restApi.rest;

import com.learnSpring.restApi.entity.Employee;
import com.learnSpring.restApi.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return this.employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findEmployee(@PathVariable int employeeId) {
        Employee employeeDb = this.employeeService.findById(employeeId);
        if (employeeDb == null) {
            throw new RuntimeException("Employee with id " + employeeId + " not found");
        }
        return this.employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0); // tells merge() to create a new employee
        Employee employeeDb = this.employeeService.save(employee);
        return employeeDb;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee employeeDb = this.employeeService.save(employee);
        return employeeDb;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee employeeDb = this.employeeService.findById(employeeId);
        if (employeeDb == null) {
            throw new RuntimeException("Employee with id " + employeeId + " not found");
        }
        this.employeeService.deleteById(employeeId);
        return "Employee with id  " + employeeId + " successfully deleted";
    }
}

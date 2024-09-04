package com.learnSpring.restApi.controller;

import com.learnSpring.restApi.entity.Employee;
import com.learnSpring.restApi.service.EmployeeService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String getEmployees(Model model) {
        List<Employee> employees = this.employeeService.findAll();
        model.addAttribute("employees", employees);
        return "list-employees";
    }
}

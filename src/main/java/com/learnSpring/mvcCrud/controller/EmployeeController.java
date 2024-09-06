package com.learnSpring.mvcCrud.controller;

import com.learnSpring.mvcCrud.entity.Employee;
import com.learnSpring.mvcCrud.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "employees/list-employees";
    }

    @GetMapping("/add-employees")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/add-employees";
    }

    @PostMapping("/save")
    public String addEmployee(@ModelAttribute("employee") Employee theEmployee) {
        theEmployee.setId(0);
        Employee employeeDb = this.employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }
}

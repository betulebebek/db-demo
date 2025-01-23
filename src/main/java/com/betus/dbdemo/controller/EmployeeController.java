package com.betus.dbdemo.controller;

import com.betus.dbdemo.model.Employee;
import com.betus.dbdemo.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/employee")

public class EmployeeController {


    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee createEmployee(@Valid @RequestBody Employee employee) {

        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/id/{id}")
    public Employee getEmployee(@PathVariable long id) {
        Employee theEmployee = employeeService.getEmployeeById(id);
        System.out.println(theEmployee);
        return theEmployee;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PutMapping("/id/{id}")
    public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.updateEmployee(id, employee);
        System.out.println(updatedEmployee);
        return updatedEmployee;
    }

    @DeleteMapping("/id/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/getTenStartsWithB")
    public List<Employee> getEmployeesWithStartsWithB() {
        System.out.println("getEmployeesWithStartsWithB");
        return employeeService.getTenStartsWithB();
    }
}














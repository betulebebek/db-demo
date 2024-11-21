package com.betus.dbdemo.service;

import com.betus.dbdemo.model.Employee;
import com.betus.dbdemo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // eğer var olmayan bir id tercih edilirse optional.empty çalışabilsin ve null controller çalıştırmak zorunda kalmayalım diye LIST yerine OPTIONAL kullanıyoruz
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Employee updateEmployee(long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setGender(employeeDetails.isGender());
        employee.setBirthday(employeeDetails.getBirthday());
        employee.setBirthplace(employeeDetails.getBirthplace());
        return employeeRepository.save(employee);

    }

    public void deleteEmployee(long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));
        employeeRepository.delete(employee);
    }
}












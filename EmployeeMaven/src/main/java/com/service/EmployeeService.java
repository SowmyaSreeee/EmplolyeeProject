package com.service;

import java.util.List;

import com.model.Employee;
import com.repo.EmployeeRepository;

public class EmployeeService {
    private EmployeeRepository employeeRepo = new EmployeeRepository();

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.findEmployeeById(id);
    }

    public void newEmployee(Employee emp) {
        employeeRepo.createEmployee(emp);
    }

    public void removeEmployee(int id) {
        employeeRepo.deleteEmployee(id);
    }

    public Employee updateEmployee(Employee emp) {
        return employeeRepo.updateEmployee(emp, emp.getId());
    }
}

package com.javaguides.realtimedemo.service;

import com.javaguides.realtimedemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}

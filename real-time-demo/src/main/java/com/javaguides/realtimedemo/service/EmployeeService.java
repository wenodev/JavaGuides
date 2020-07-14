package com.javaguides.realtimedemo.service;

import com.javaguides.realtimedemo.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    //CREATE or UPDATE
    void saveEmployee(Employee employee);

    //READ ALL
    List<Employee> getAllEmployees();

    //READ ById
    Employee getEmployeeById(long id);

    //DELETE
    void deleteEmployeeById(long id);

    //Paging
    Page<Employee> findPaginated(int pageNo, int pageSize);




}

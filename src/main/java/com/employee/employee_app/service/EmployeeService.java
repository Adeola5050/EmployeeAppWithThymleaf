package com.employee.employee_app.service;

import com.employee.employee_app.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployee();

    void save(Employee employee);

    Employee getById(Long id);
    void deleteById(long id);
}


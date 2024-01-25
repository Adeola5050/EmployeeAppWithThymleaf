package com.employee.employee_app.service;

import com.employee.employee_app.model.Employee;
import com.employee.employee_app.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeRepo.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeRepo.save(employee);

    }

    @Override
    public Employee getById(Long id) {
        Optional<Employee> optional = employeeRepo.findById(id);
        Employee employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                    "Employee not found for id : " + id);
        return employee;
    }

    @Override
    public void deleteById(long id) {
        employeeRepo.deleteById(id);

    }
}

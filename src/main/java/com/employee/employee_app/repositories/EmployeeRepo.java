package com.employee.employee_app.repositories;

import com.employee.employee_app.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}

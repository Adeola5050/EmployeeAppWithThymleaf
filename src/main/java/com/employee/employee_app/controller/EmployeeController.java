package com.employee.employee_app.controller;

import com.employee.employee_app.model.Employee;
import com.employee.employee_app.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("employee", employeeServiceImpl.getAllEmployee());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model) {
        Employee employee= new Employee();
        model.addAttribute("employee", employee);
        return "newemployee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeServiceImpl.save(employee);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        Employee employee = employeeServiceImpl.getById(id);
        model.addAttribute("employee", employee);
        return "update";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        employeeServiceImpl.deleteById(id);
        return "redirect:/";

    }
}

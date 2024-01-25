package com.employee.employee_app.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

}

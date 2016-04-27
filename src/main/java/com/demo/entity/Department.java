package com.demo.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_department_name", columnNames = "name")})
public class Department {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private School school;

}

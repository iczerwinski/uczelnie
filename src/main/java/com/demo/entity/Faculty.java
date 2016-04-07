package com.demo.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_faculty_name", columnNames = "name")})
public class Faculty {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

}

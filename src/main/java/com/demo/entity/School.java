package com.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_school_name", columnNames = "name")})
public class School {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String logoUrl;

    private String phone;

    private String fax;

    private String www;

    private String address;

    private Boolean isPublic;

    private String description;

    @ManyToOne
    private SchoolType schoolType;

    @ManyToOne
    public City city;

    @OneToMany(mappedBy = "school")
    private List<Department> departments;
}
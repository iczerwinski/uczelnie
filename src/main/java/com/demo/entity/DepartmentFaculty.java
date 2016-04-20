package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "DepartmentFaculty")
public class DepartmentFaculty {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Faculty faculty;
    @ManyToOne
    private SchoolType schoolType;

    @ManyToOne
    private StudyMode firstLevelEngineer;

    @ManyToOne
    private StudyMode firstLevelBachelor;

    @ManyToOne
    private StudyMode masterLevel;

    @ManyToOne
    private StudyMode unifiedLevel;


}

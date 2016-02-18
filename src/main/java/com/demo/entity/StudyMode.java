package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudyMode {

    @Id
    @GeneratedValue
    private Integer id;

    private Boolean s;

    private Boolean np;

    private Boolean nsn;
}

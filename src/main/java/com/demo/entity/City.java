package com.demo.entity;

import java.util.List;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_city_name", columnNames = "name")})
public class City {

    public final static String WARSAW_ID = "1";

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private Voivodeship voivodeship;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}

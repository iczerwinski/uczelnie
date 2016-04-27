package com.demo.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Getter

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_voivodeship_name", columnNames = "name")})
public class Voivodeship {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "voivodeship")
    private Set<City> cities;

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

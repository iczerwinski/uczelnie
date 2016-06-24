package com.demo.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_login", columnNames = "login")})
@Getter
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String login;

    private String password;

    public User() {
    }

    public User(String firstName, String login, String password) {
        this.firstName = firstName;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }
}

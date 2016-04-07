package com.demo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCredentialDto {

    private String firstName;

    private String login;

    private String password;

    public UserCredentialDto() {
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }
}

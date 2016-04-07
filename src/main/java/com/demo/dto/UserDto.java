package com.demo.dto;


import lombok.Getter;

@Getter
public class UserDto {

    private String firstName;

    private String login;

    public UserDto(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }


    public String getFirstName() {
        return firstName;
    }
}

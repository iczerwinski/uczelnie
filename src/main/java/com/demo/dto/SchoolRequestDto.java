package com.demo.dto;


public class SchoolRequestDto {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public SchoolRequestDto() {
    }

    public SchoolRequestDto(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

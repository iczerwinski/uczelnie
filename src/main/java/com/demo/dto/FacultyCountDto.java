package com.demo.dto;


import lombok.Getter;

@Getter
public class FacultyCountDto {

    private Integer id;

    private String name;

    private Long count;

    public FacultyCountDto(Integer id, String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }
}

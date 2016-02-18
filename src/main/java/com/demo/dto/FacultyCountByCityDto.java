package com.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FacultyCountByCityDto {

    private Integer id;

    private String name;

    private Long count;

    private String cityName;

    private Integer cityId;
}

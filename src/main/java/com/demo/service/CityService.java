package com.demo.service;

import com.demo.entity.City;
import com.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;


    public List<City> getCities() {
        return cityRepository.findAll();
    }
//
//    public List<City> getBySchoolId(Integer schoolId) {
//        return cityRepository.findBySchoolId(schoolId);
//    }

}

package com.demo.service;

import com.demo.dto.SchoolRequestDto;
import com.demo.entity.School;
import com.demo.repository.CityRepository;
import com.demo.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    CityRepository cityRepository;

    public void add(SchoolRequestDto schoolRequestDto) {
        School school = new School();
        school.setName(schoolRequestDto.getName());
        school.setAddress(schoolRequestDto.getAddress());
        schoolRepository.save(school);
    }

    public Iterable<School> getSchools() {
        return schoolRepository.findAll();
    }


    public List<School> getSchoolsBySchollTypeIdAndFacultyNameAndCityNameAndSchoolName(Integer schoolTypeId, String facultyName, String cityName, String schoolName) {
        return schoolRepository.findBySchoolTypeIdAndFacultyNameAndCityNameAndSchoolName(schoolTypeId, facultyName == null ? null : facultyName.toLowerCase(), cityName == null ? null : cityName.toLowerCase(), schoolName == null ? null : schoolName.toLowerCase());
    }


    public School get(Integer schoolId) {
        return schoolRepository.findOne(schoolId);
    }

    public School update(Integer schoolId, SchoolRequestDto schoolRequestDto) {
        School school = new School();
        school.setId(schoolId);
        school.setName(schoolRequestDto.getName());
        school.setAddress(schoolRequestDto.getAddress());
        return schoolRepository.save(school);
    }

    //  public List<School> findByPromoOrderAsc(Integer schoolId, Integer promo ) {
    //     return schoolRepository.findByPromoOrderAsc(schoolId, promo);
    //  }

    public List<School> getSchoolPromo() {
        return schoolRepository.findOneByOrderByPromoAsc();
    }

    public List<School> getSchoolsByCityId(Integer cityId) {
        return schoolRepository.findSchoolsByCityId(cityId);
    }


    public List<School> getSchoolsByFacultyId(Integer facultyId) {
        return schoolRepository.findSchoolsByFacultyId(facultyId);
    }


}
package com.demo.service;

import com.demo.dto.SchoolRequestDto;
import com.demo.entity.School;
import com.demo.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    public void add(SchoolRequestDto schoolRequestDto) {
        School school = new School();
        school.setName(schoolRequestDto.getName());
        school.setAddress(schoolRequestDto.getAddress());
        schoolRepository.save(school);
    }

    public Iterable<School> getSchools() {
        return schoolRepository.findAll();
    }

    public List<School> getSchoolsBySchollTypeIdAndFacultyName(Integer schoolTypeId, String facultyName) {
        return schoolRepository.findBySchoolTypeIdAndFacultyName(schoolTypeId, facultyName == null ? null : facultyName.toLowerCase());
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


}

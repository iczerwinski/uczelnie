package com.demo.service;

import com.demo.dto.FacultyCountByCityDto;
import com.demo.dto.FacultyCountDto;
import com.demo.entity.Department;
import com.demo.entity.Faculty;
import com.demo.repository.DepartmentFacultyRepository;
import com.demo.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    FacultyRepository facultyRepository;

    @Autowired
    DepartmentFacultyRepository departmentFacultyRepository;

    public List<FacultyCountDto> findFaculties() {
        return facultyRepository.findFacultiesWithCount(new PageRequest(0, 3));
    }

    public List<FacultyCountByCityDto> findFacultiesByCity(Integer cityId) {

        return facultyRepository.findFacultiesWithCountByCity(cityId);
    }

    /*
    public List<FacultyCountDto> findFaculties() {
        List<FacultyCountDto> facultyCountDtos = new ArrayList<>();
        List<Faculty> facultyList = facultyRepository.findByOrderByName();
        for (Faculty faculty : facultyList) {
            facultyCountDtos.add(new FacultyCountDto(faculty.getId(), faculty.getName(), departmentFacultyRepository.countByFaculty(faculty)));
        }
        return facultyCountDtos;
    }
    */

    public List<Faculty> getBySchoolId(Integer schoolId) {
        return facultyRepository.findBySchoolId(schoolId);
    }

}

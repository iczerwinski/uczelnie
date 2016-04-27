package com.demo.service;

import com.demo.entity.Department;
import com.demo.repository.DepartmentFacultyRepository;
import com.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    DepartmentFacultyRepository departmentFacultyRepository;

    public List<Department> getBySchoolId(Integer schoolId) {
        return departmentRepository.findBySchoolId(schoolId);
    }
//

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

}

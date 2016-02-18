package com.demo.service;

import com.demo.entity.SchoolType;
import com.demo.repository.SchoolTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolTypeService {

    @Autowired
    SchoolTypeRepository schoolTypeRepository;

    public List<SchoolType> getSchoolTypes() {
        return schoolTypeRepository.findByOrderByNameAsc();
    }

}

package com.demo.repository;

import com.demo.entity.DepartmentFaculty;
import com.demo.entity.Faculty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentFacultyRepository extends CrudRepository<DepartmentFaculty, Integer> {


    Integer countByFaculty(Faculty faculty);
}

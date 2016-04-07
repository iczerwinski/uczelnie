package com.demo.repository;

import com.demo.entity.School;
import com.demo.entity.SchoolType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School, Integer> {

    @Query("SELECT DISTINCT s " +
            "FROM DepartmentFaculty df " +
            "JOIN df.department.school AS s " +
            "WHERE s.schoolType.id = :schoolTypeId " +
            "   AND (:facultyName IS NULL OR LOWER(df.faculty.name) LIKE CONCAT('%', :facultyName, '%')) " +
            "ORDER BY s.name ")
    List<School> findBySchoolTypeIdAndFacultyName(@Param("schoolTypeId") Integer schoolTypeId, @Param("facultyName") String facultyName);

    School findByName(String name);

    List<School> findOneByOrderByPromoAsc();


}

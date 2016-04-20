package com.demo.repository;

import com.demo.entity.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School, Integer> {

    @Query("SELECT DISTINCT s " +
            "FROM DepartmentFaculty df " +
            "JOIN df.department.school AS s " +
            "WHERE s.schoolType.id = :schoolTypeId " +
            "   AND (:facultyName IS NULL OR LOWER(df.faculty.name) LIKE CONCAT('%', :facultyName, '%')) " +
            "   AND (:cityName IS NULL OR LOWER(s.city.name) LIKE CONCAT('%', :cityName, '%')) " +
            "   AND (:schoolName IS NULL OR LOWER(s.name) LIKE CONCAT('%', :schoolName, '%')) " +
            "ORDER BY s.name ")
    List<School> findBySchoolTypeIdAndFacultyNameAndCityNameAndSchoolName(@Param("schoolTypeId") Integer schoolTypeId, @Param("facultyName") String facultyName, @Param("cityName") String cityName, @Param("schoolName") String schoolName);


    School findByName(String name);

    List<School> findOneByOrderByPromoAsc();


    List<School> findSchoolsByCityId(@Param("cityId") Integer cityId);

    @Query("SELECT DISTINCT s " +
            "FROM DepartmentFaculty AS df " +
            "JOIN df.department.school AS s " +
            "WHERE df.faculty.id = :facultyId " +
            "ORDER BY s.name ")
    List<School> findSchoolsByFacultyId(@Param("facultyId") Integer FacultyId);

}

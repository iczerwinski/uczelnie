package com.demo.repository;

import com.demo.dto.FacultyCountByCityDto;
import com.demo.dto.FacultyCountDto;
import com.demo.entity.Faculty;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Integer> {


    List<Faculty> findByOrderByName();

    /*@Query("SELECT " +
            "new com.demo.dto.FacultyCountDto(" +
            "   f.id, " +
            "   f.name, " +
            "   (SELECT count(*) FROM DepartmentFaculty AS df WHERE df.faculty.id = f.id ) " +
            ") " +
            "FROM Faculty AS f " +
            "ORDER BY f.name ")*/

    @Query("SELECT " +
            "new com.demo.dto.FacultyCountDto(" +
            "   df.faculty.id, " +
            "   df.faculty.name, " +
            "   count(*) " +
            ") " +
            "FROM DepartmentFaculty AS df " +
            "GROUP BY df.faculty.id, df.faculty.name " +
            "ORDER BY count(*) DESC, df.faculty.name ASC ")
    List<FacultyCountDto> findFacultiesWithCount(Pageable page);

    @Query("SELECT " +
            "new com.demo.dto.FacultyCountByCityDto(" +
            "   df.faculty.id, " +
            "   df.faculty.name, " +
            "   count(*), " +
            "   df.department.school.city.name, " +
            "   df.department.school.city.id " +
            ") " +
            "FROM DepartmentFaculty AS df " +
            "WHERE df.department.school.city.id = :cityId " +
            "GROUP BY df.faculty.id, df.faculty.name " +
            "ORDER BY count(*) DESC, df.faculty.name ASC ")
    List<FacultyCountByCityDto> findFacultiesWithCountByCity(@Param("cityId") Integer cityId);

    @Query("SELECT df.faculty " +
            "FROM DepartmentFaculty AS df " +
            "WHERE df.department.school.id = :schoolId " +
            "GROUP BY df.faculty " +
            "ORDER BY df.faculty.name ")
    List<Faculty> findBySchoolId(@Param("schoolId") Integer schoolId);
}

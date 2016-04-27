package com.demo.repository;

import com.demo.entity.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {


//    @Query("SELECT d.name " +
//            "FROM Department AS d " +
//            "WHERE d.schoolId = :schoolId "+
//            "GROUP BY d.name " +
//            "ORDER BY d.name "
//    )


    @Query("SELECT df.department " +
            "FROM DepartmentFaculty AS df " +
            "WHERE df.department.school.id = :schoolId " +
            "GROUP BY df.department   " +
            "ORDER BY df.department.name ")
    List<Department> findBySchoolId(@Param("schoolId") Integer schoolId);


//    @Query("SELECT df.department " +
//            "FROM DepartmentFaculty AS df " +
//            "WHERE df.department.school.id = :schoolId " +
//            "GROUP BY df.department.id, df.department.name "
//            )
//
//            List<Department>findBySchoolId(@Param("schoolId") Integer schoolId);

//    @Query("SELECT df.faculty " +
//            "FROM DepartmentFaculty AS df " +
//            "WHERE df.department.school.id = :schoolId " +
//            "GROUP BY df.faculty " +
//            "ORDER BY df.faculty.name ")
//    List<Faculty> findBySchoolId(@Param("schoolId") Integer schoolId);
//@Query("SELECT df.faculty " +
//        "FROM DepartmentFaculty AS df " +
//        "WHERE df.department.school.id = :schoolId " +
//        "GROUP BY df.department " +
//        "ORDER BY df.department.name ")


    List<Department> findAll();


}

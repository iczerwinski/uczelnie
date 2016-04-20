package com.demo.repository;

import com.demo.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {


    List<City> findAll();

//    List<City> findBySchoolId(@Param("schoolId") Integer schoolId);


}

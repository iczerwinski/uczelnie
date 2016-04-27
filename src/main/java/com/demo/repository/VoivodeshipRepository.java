package com.demo.repository;

import com.demo.entity.Voivodeship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoivodeshipRepository extends CrudRepository<Voivodeship, Integer> {

    List<Voivodeship> findOneByOrderByNameAsc();

}

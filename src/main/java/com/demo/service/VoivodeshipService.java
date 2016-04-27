package com.demo.service;

import com.demo.entity.Voivodeship;
import com.demo.repository.VoivodeshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoivodeshipService {
    @Autowired
    VoivodeshipRepository voivodeshipRepository;

    public List<Voivodeship> getVoivodeships() {
        return voivodeshipRepository.findOneByOrderByNameAsc();
    }


}

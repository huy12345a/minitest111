package com.codegym.service;
import com.codegym.model.Province;
import com.codegym.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    public Province findById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    public void delete(Long id) {
        provinceRepository.deleteById(id);
    }
}


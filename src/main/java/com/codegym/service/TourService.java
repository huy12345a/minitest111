package com.codegym.service;
import com.codegym.model.Tour;
import com.codegym.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public List<Tour> findAll() {
        return tourRepository.findAll();
    }

    public Tour findById(Long id) {
        return tourRepository.findById(id).orElse(null);
    }

    public Tour save(Tour tour) {
        return tourRepository.save(tour);
    }

    public void delete(Long id) {
        tourRepository.deleteById(id);
    }
}


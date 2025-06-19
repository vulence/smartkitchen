package com.gomboc.smartkitchen.units.service;

import com.gomboc.smartkitchen.units.entity.Unit;
import com.gomboc.smartkitchen.units.repository.UnitsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UnitsService {

    private final UnitsRepository unitsRepository;

    public Unit findById(Long id) {
        return unitsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("The unit with the id %s cannot be found!".formatted(id)));
    }
}

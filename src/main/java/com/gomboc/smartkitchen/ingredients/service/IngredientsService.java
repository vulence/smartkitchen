package com.gomboc.smartkitchen.ingredients.service;

import com.gomboc.smartkitchen.ingredients.entity.Ingredient;
import com.gomboc.smartkitchen.ingredients.repository.IngredientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientsService {

    private final IngredientsRepository repository;

    public List<Ingredient> findAll() {
        return repository.findAll();
    }
}

package com.gomboc.smartkitchen.recipes.service;

import com.gomboc.smartkitchen.recipes.entity.Recipe;
import com.gomboc.smartkitchen.recipes.repository.RecipesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RecipesService {

    private final RecipesRepository recipesRepository;

    public List<Recipe> findAll() {
        return recipesRepository.findAll();
    }

    public Recipe create(Recipe recipe) {
        return recipesRepository.save(recipe);
    }
}

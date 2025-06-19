package com.gomboc.smartkitchen.recipes.controller;

import com.gomboc.smartkitchen.recipes.dto.CreateRecipeRequest;
import com.gomboc.smartkitchen.recipes.mapper.RecipesMapper;
import com.gomboc.smartkitchen.recipes.entity.Recipe;
import com.gomboc.smartkitchen.recipes.service.RecipesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/recipes")
public class RecipesController {

    private final RecipesService recipesService;
    private final RecipesMapper recipesMapper;

    @GetMapping
    public ResponseEntity<List<Recipe>> findAll() {
        return ResponseEntity.ok(recipesService.findAll());
    }

    @PostMapping
    public ResponseEntity<Recipe> create(@RequestBody @Valid CreateRecipeRequest recipeRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                recipesService.create(recipesMapper.toEntity(recipeRequest))
        );
    }
}

package com.gomboc.smartkitchen.recipes.repository;

import com.gomboc.smartkitchen.recipes.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipesRepository extends JpaRepository<Recipe, Long> {
}

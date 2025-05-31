package com.gomboc.smartkitchen.ingredients.repository;

import com.gomboc.smartkitchen.ingredients.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient, Long> {
}

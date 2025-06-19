package com.gomboc.smartkitchen.recipes.entity;

import com.gomboc.smartkitchen.recipeingredient.RecipeIngredient;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer minutesToMake;

    @ElementCollection
    @CollectionTable(name = "recipe_instructions", joinColumns = @JoinColumn(name = "recipe_id"))
    @OrderColumn(name = "step_number")
    private List<String> instructions;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecipeIngredient> ingredients;
}

package com.gomboc.smartkitchen.recipeingredient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gomboc.smartkitchen.ingredients.entity.Ingredient;
import com.gomboc.smartkitchen.recipes.entity.Recipe;
import com.gomboc.smartkitchen.units.entity.Unit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "recipe_id")
    @JsonIgnore
    private Recipe recipe;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @ManyToOne(optional = false)
    @JoinColumn(name = "unit_id")
    private Unit unit;

    private Double amount;
}

package com.gomboc.smartkitchen.recipes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gomboc.smartkitchen.recipeingredient.dto.RecipeIngredientRequest;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.List;

public record CreateRecipeRequest(
        @JsonProperty("name")
        @NotNull
        String name,

        @JsonProperty("ingredients")
        @NotNull
        List<RecipeIngredientRequest> ingredients,

        @JsonProperty("instructions")
        @NotNull
        @Size(min = 1)
        List<String> instructions,

        @JsonProperty("minutesToMake")
        @NotNull
        Integer minutesToMake
) {
}

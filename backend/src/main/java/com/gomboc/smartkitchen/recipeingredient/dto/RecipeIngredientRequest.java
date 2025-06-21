package com.gomboc.smartkitchen.recipeingredient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record RecipeIngredientRequest(
        @JsonProperty("ingredient_id")
        @NotNull
        Long ingredientId,

        @JsonProperty("amount")
        @NotNull
        @Positive
        Double amount,

        @JsonProperty("unit_id")
        @NotNull
        Long unitId
) {
}

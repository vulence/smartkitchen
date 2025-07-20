package com.gomboc.smartkitchen.recipes.dto;

public record ShortRecipe(
        Long id,
        String name,
        Integer minutesToMake,
        Integer totalKcal,
        String imageUrl
) {
}

package com.gomboc.smartkitchen.recipes.mapper;

import com.gomboc.smartkitchen.ingredients.entity.Ingredient;
import com.gomboc.smartkitchen.ingredients.service.IngredientsService;
import com.gomboc.smartkitchen.recipeingredient.RecipeIngredient;
import com.gomboc.smartkitchen.recipeingredient.dto.RecipeIngredientRequest;
import com.gomboc.smartkitchen.recipes.dto.CreateRecipeRequest;
import com.gomboc.smartkitchen.recipes.entity.Recipe;
import com.gomboc.smartkitchen.units.entity.Unit;
import com.gomboc.smartkitchen.units.service.UnitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RecipesMapper {

    private final IngredientsService ingredientsService;
    private final UnitsService unitsService;

    public Recipe toEntity(CreateRecipeRequest recipeRequest) {
        Recipe recipe = new Recipe();

        recipe.setName(recipeRequest.name());
        recipe.setMinutesToMake(recipeRequest.minutesToMake());
        recipe.setInstructions(recipeRequest.instructions());
        recipe.setIngredients(mapRecipeIngredients(recipeRequest.ingredients(), recipe));

        return recipe;
    }

    private List<RecipeIngredient> mapRecipeIngredients(List<RecipeIngredientRequest> recipeIngredientRequests, Recipe recipe) {
        return recipeIngredientRequests
                .stream()
                .map(req -> mapSingleIngredient(req, recipe))
                .toList();
    }

    private RecipeIngredient mapSingleIngredient(RecipeIngredientRequest req, Recipe recipe) {
        Ingredient ingredient = ingredientsService.findById(req.ingredientId());
        Unit unit = unitsService.findById(req.unitId());

        RecipeIngredient recipeIngredient = new RecipeIngredient();
        recipeIngredient.setAmount(req.amount());
        recipeIngredient.setIngredient(ingredient);
        recipeIngredient.setRecipe(recipe);
        recipeIngredient.setUnit(unit);

        return recipeIngredient;
    }
}

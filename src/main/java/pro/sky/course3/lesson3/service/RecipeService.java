package pro.sky.course3.lesson3.service;

import pro.sky.course3.lesson3.model.Recipe;


public interface RecipeService {
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(Integer id);
}

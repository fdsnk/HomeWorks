package pro.sky.oldcourse3.lesson3.service;

import pro.sky.oldcourse3.lesson3.model.Recipe;


public interface RecipeService {
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(Integer id);
}

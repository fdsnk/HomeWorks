package pro.sky.course3.lesson3.service;

import pro.sky.course3.lesson3.model.Ingredient;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);

    Ingredient getIngredient(Integer id);
}

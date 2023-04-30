package pro.sky.course3.lesson3.service;

import org.springframework.stereotype.Service;
import pro.sky.course3.lesson3.model.Ingredient;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final Map<Integer, Ingredient> ingredientMap = new HashMap<>();
    private static Integer id = 0;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        ingredientMap.put(id++, ingredient);
        return ingredient;
    }

    @Override
    public Ingredient getIngredient(Integer id) {
        return ingredientMap.getOrDefault(id, null);
    }
}

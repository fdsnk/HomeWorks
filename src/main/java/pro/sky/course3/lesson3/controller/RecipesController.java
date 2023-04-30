package pro.sky.course3.lesson3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pro.sky.course3.lesson3.model.Recipe;
import pro.sky.course3.lesson3.service.RecipeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recipe")
public class RecipesController {
    private final RecipeService recipesService;


    @PostMapping
    Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipesService.addRecipe(recipe);
    }

    @GetMapping("/{id}")
    Recipe getRecipe(@PathVariable Integer id) {
        return recipesService.getRecipe(id);
    }
}

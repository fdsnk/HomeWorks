package skypro.java.course2.lesson8;

import java.util.HashMap;
import java.util.Objects;

public class Recipe {

    private final HashMap<Product, Integer> products = new HashMap<>();
    private Double costOfProducts = 0.0;
    private final String nameRecipe;

    public Recipe(String nameRecipe) {
        this.nameRecipe = (nameRecipe != null && !nameRecipe.trim().isEmpty()) ? nameRecipe
                : "...введите название рецепта...";
    }

    public void addProductInRecipe(Product product, Integer value) {
        if (products.containsKey(product)) {
            throw new RuntimeException("Продукт уже есть в списке рецепта: " + product.getName());
        } else if (value != null && value < 1) {
            throw new IllegalArgumentException(
                    "Количество продуктов должно быть не меньше 1! " + getNameRecipe());
        } else {
            products.put(product, value);
        }
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Double getCostOfProducts() {
        for (Product product : products.keySet()) {
            costOfProducts += product.getPrice() * products.get(product);
        }
        return costOfProducts;
    }

    @Override
    public String toString() {
        return String.format("\nНазвание рецепта:\"%s\", необходимые продукты:%s\n", nameRecipe,
                getProducts());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(products, recipe.products) && Objects.equals(
                costOfProducts, recipe.costOfProducts) && Objects.equals(nameRecipe,
                recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, costOfProducts, nameRecipe);
    }
}

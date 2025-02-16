package org.example.lesson_11

class RecipeCategory(
    val listOfRecipes: List<Recipe>,
    val nameOfCategory: String,
    val categoryImage: String = "category_image.png",
) {}

class Recipe(
    val nameOfRecipe: String,
    val listOfIngredients: List<Ingredients>,
    val portions: Int,
    var isFavorite: Boolean = false,
    val recipeImage: String = "recipe_image.png",
) {}

class Ingredients(
    val nameOfIngredient: String,
    val amountOfIngredient: Int,
) {}

package org.example.lesson_1_10.lesson_8

fun main() {
    val ingredients: Array<String> = arrayOf("лук", "зелень", "мясо курицы", "рис", "картошка")
    val inputIngredient: String = readln()
    var isIngredientInRecipe: Boolean = false

    for (i in ingredients) {
        if (i == inputIngredient) {
            println("Ингредиент $inputIngredient в рецепте есть")
            isIngredientInRecipe = true
            break
        }
    }
    if (!isIngredientInRecipe) {
        println("Такого ингредиента в рецепте нет")
    }
}
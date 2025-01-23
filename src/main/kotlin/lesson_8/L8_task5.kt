package org.example.lesson_8

fun main() {
    print("Введите кол-во ингредиентов: ")
    val numberOfIngredients: Int = readln().toInt()
    val ingredients: Array<String> = Array(numberOfIngredients) { "" }

    for (i in 0 until numberOfIngredients) {
        print("Введите ${i + 1}-й ингредиент: ")
        ingredients[i] = readln()
    }

    val ingredientsSeparatedByCommas = ingredients.joinToString(", ")
    println(ingredientsSeparatedByCommas)
}

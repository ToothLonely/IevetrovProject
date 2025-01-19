package org.example.lesson_8

fun main() {
    print("Введите кол-во ингредиентов: ")
    val numberOfIngredients: Int = readln().toInt()
    val ingredients: Array<String> = Array(numberOfIngredients) { "" }

    for (i in 0 until numberOfIngredients) {
        print("Введите ${i + 1}-й ингредиент: ")
        ingredients[i] = readln()
    }

    for (i in 0 until numberOfIngredients) {
        if (i == ingredients.indexOf(ingredients.last())) {
            print("${ingredients[i]} ")
        } else {
            print("${ingredients[i]}, ")
        }
    }
}

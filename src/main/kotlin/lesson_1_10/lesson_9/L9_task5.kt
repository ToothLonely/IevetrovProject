package org.example.lesson_1_10.lesson_9

fun main() {
    var totalIngredients = 0
    val ingredients: MutableSet<String> = mutableSetOf()

    while (totalIngredients < 5) {
        println("Введите ${++totalIngredients}-й ингредиент")
        ingredients.add(readln())
        if (ingredients.size != totalIngredients) {
            println("Внимание! Каждый ингредиент должен быть уникальным.")
            totalIngredients--
        }
    }

    println("Ваш список ингредиентов: ")
    print(ingredients.sorted().joinToString(", ") {
        if (it == ingredients.sorted().first()) {
            it.replaceFirstChar(Char::uppercaseChar)
        } else {
            it
        }
    })
}
package org.example.lesson_9

fun main() {
    val ingredients: List<String> = listOf("лук", "зелень", "мясо курицы", "рис", "картошка")

    println("В рецепте есть следующие ингредиенты: ")
    ingredients.forEach { ingredient: String ->
        println(ingredient)
    }
}
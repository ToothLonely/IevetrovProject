package org.example.lesson_1_10.lesson_8

fun main() {
    val ingredients: Array<String> = arrayOf("лук", "зелень", "мясо курицы", "рис", "картошка")
    val inputIngredient: String = readln()

    if (inputIngredient in ingredients) {
        println("Ингредиент $inputIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
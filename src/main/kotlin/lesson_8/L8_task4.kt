package org.example.lesson_8

fun main() {
    val ingredients: Array<String> = arrayOf("лук", "зелень", "мясо курицы", "рис", "картошка")
    println("Список ингредиентов:")
    ingredients.forEach { print("$it ") }

    println("\nКакой ингредиент хотите заменить? ")
    val substituteIngredient: String = readln()

    if (substituteIngredient !in ingredients) {
        println("Нет такого ингредиента")
    } else {
        print("Введите новый ингредиент: ")
        val newIngredient: String = readln()
        val indexOfSubstituteIngredient: Int = ingredients.indexOf(substituteIngredient)//Индекс выбранного ингредиента
        ingredients[indexOfSubstituteIngredient] = newIngredient

        print("Готово! Вы сохранили следующий список: ")
        ingredients.forEach {
            print("$it ")
        }
    }
}
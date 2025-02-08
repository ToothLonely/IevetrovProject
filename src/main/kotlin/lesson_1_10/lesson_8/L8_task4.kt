package org.example.lesson_1_10.lesson_8

fun main() {
    val ingredients: Array<String> = arrayOf("лук", "зелень", "мясо курицы", "рис", "картошка")
    println("Список ингредиентов:")
    ingredients.forEach { print("$it ") }

    println("\nКакой ингредиент хотите заменить? ")
    val substituteIngredient: String = readln()
    val indexOfSubstituteIngredient = ingredients.indexOf(substituteIngredient)

    if (indexOfSubstituteIngredient == -1) {
        println("Нет такого ингредиента")
        return
    } else {
        print("Введите новый ингредиент: ")
        val newIngredient: String = readln()
        ingredients[indexOfSubstituteIngredient] = newIngredient

        print("Готово! Вы сохранили следующий список: ")
        ingredients.forEach {
            print("$it ")
        }
    }
}
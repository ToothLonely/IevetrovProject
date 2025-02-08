package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введите 5 ингредиентов через запятую: ")
    var ingredients: List<String>

    do {
        ingredients = readln().split(", ")
        if (ingredients.size != 5) {
            println("Необходимо ввести ровно 5 ингредиентов (через запятую): ")
        }
    } while (ingredients.size != 5)

    print("${ingredients.sorted()}")
}
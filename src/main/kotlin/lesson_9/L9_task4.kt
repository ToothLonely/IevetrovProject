package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов через запятую: ")
    var ingredients: List<String> = readln().split(", ")
    while (ingredients.size != 5) {
        println("Необходимо ввести ровно 5 ингредиентов (через запятую): ")
        ingredients = readln().split(", ")
    }
    println("${ingredients.sorted()}")
}
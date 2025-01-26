package org.example.lesson_3

fun main() {
    val name: String = "Иван"
    val evening: String = "Добрый вечер"
    val morning: String = "Доброе утро"

    var greeting: String = morning + ',' + name + '!'
    println(greeting)

    greeting = "$evening, $name!"
    println(greeting)
}
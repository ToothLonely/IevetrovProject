package org.example.lesson_3

fun main() {

    val name: String = "Иван"
    val evening: String = "Добрый вечер"
    val morning: String = "Доброе утро"

    //Утреннее приветствие
    var greeting: String = morning + ',' + name + '!'
    println(greeting)

    //Вечернее приветсвие
    greeting = "$evening, $name!"
    println(greeting)
}
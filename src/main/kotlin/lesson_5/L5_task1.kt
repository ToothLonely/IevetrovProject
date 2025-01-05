package org.example.lesson_5

fun main() {
    val firstTerm = (0..10).random()
    val secondTerm = (0..10).random()

    println("Подтвердите, что вы не робот. Вычислите сумму $firstTerm и $secondTerm")

    val inputResult = readln().toInt()

    //Проверка правильности решения
    if(inputResult == firstTerm + secondTerm) {
        println("Вы не робот!")
    } else {
        println("Вы робот!")
    }
}
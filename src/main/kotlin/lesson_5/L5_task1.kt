package org.example.lesson_5

fun main() {
    val firstTem = (0..10).random()
    val secondTem = (0..10).random()

    println("Подтвердите, что вы не робот. Вычислите сумму $firstTem и $secondTem")

    val inputResult = readln().toInt()

    //Проверка правильности решения
    if(inputResult == firstTem + secondTem) {
        println("Вы не робот!")
    } else {
        println("Вы робот!")
    }
}
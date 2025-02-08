package org.example.lesson_1_10.lesson_2

import kotlin.math.pow

fun main() {
    val startSum: Int = 70_000
    val percent: Double = 16.7
    val numberOfYears: Byte = 20
    val targetSum: Double

    //Вычисление финальной суммы
    targetSum = startSum * (1 + percent / 100).pow(numberOfYears.toInt())

    //Стоит ли записывать форматированную строку в отдельную переменную, как я делал до этого?
    println(String.format("%.3f", targetSum))
}
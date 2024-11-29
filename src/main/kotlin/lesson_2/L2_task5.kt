package org.example.lesson_2

import kotlin.math.pow

fun main() {
    // Sn = S0 * (1 + p/100)**n
    val startSum: Int = 70_000
    val percent: Double = 0.167
    val numberOfYears: Byte = 20
    val targetSum: Double

    //Вычисление финальной суммы
    targetSum = startSum * (1 + percent).pow(numberOfYears.toInt())

    //Стоит ли записывать форматированную строку в отдельную переменную, как я делал до этого?
    println(String.format("%.3f", targetSum))
}
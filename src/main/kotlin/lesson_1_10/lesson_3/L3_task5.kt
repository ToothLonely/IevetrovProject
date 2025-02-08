package org.example.lesson_1_10.lesson_3

fun main() {
    val inputMove: String = "D2-D4;0"
    val stepAndCount = inputMove.split(';', '-')
    val countMove = stepAndCount[2]
    val start = stepAndCount[0]
    val finish = stepAndCount[1]

    println(start)
    println(finish)
    println(countMove)
}
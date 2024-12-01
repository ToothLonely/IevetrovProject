package org.example.lesson_3

fun main() {
    val inputMove: String = "D2-D4;0"
    val stepAndCount = inputMove.split(';')
    val countMove = stepAndCount[1]
    val step = stepAndCount[0].split('-')
    val start = step[0]
    val finish = step[1]
    println(start)
    println(finish)
    println(countMove)
}
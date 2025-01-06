package org.example.lesson_8

fun main() {
    val daysPerWeek: Byte = 7
    val numberOfAdViews = IntArray(daysPerWeek.toInt())

    for (i in 0 until daysPerWeek) {
        numberOfAdViews[i] = (0..9).random()
    }

    print("Просмотры за неделю (по дням): ")
    numberOfAdViews.forEach {
        print("$it ")
    }
    println("\nСуммарное количество просмотров за неделю: ${numberOfAdViews.sum()}")
}
package org.example.lesson_16

class Cube {
    private val valueRange = 1..6
    private val number = valueRange.random()

    fun getNumber() {
        println("Выпало число: $number")
    }
}
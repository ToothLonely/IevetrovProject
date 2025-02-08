package org.example.lesson_1_10.lesson_6

fun main() {
    val randomNumber: Byte = (1..9).random().toByte()
    var tryCounter: Byte = 5
    var inputNumber: Byte

    do {
        print("Введите число [1;9]: ")
        inputNumber = readln().toByte()
        if (inputNumber == randomNumber) {
            println("Это была великолепная игра!")
            tryCounter = 0
        } else {
            println("Неверно! Оставшееся количество попыток: ${--tryCounter}")
            if (tryCounter.toInt() == 0) {
                println("Было загадано число $randomNumber")
            }
        }
    } while (tryCounter.toInt() != 0)
}
package org.example.lesson_6

fun main() {
    var firstTerm: Byte
    var secondTerm: Byte
    var inputResult: Int
    var attemptCounter: Byte = 3
    var incorrectResult: Boolean = true

    while (incorrectResult && attemptCounter != 0.toByte()) {

        firstTerm = (0..9).random().toByte()
        secondTerm = (0..9).random().toByte()

        print("Подтвердите, что вы не робот. Вычислите сумму $firstTerm и $secondTerm: ")
        inputResult = readln().toInt()

        if (inputResult == firstTerm + secondTerm) {
            incorrectResult = false
            println("Добро пожаловать!")
        } else if (attemptCounter > 1) {
            println("Неудача! Осталось попыток: ${--attemptCounter}")
        } else {
            println("Доступ запрещен")
            attemptCounter--
        }
    }
}
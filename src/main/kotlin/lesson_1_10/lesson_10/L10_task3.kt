package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun generatePassword(passwordLength: Int): String {
    val intRange = (0..9)
    val charRange = (' '..'/')
    var password: String = ""
    var isNumber: Boolean = Random.nextBoolean() //Рандомно выбираю что будет первым, число или спецсимвол

    for (i in 0 until passwordLength) {
        if (isNumber) {
            password += intRange.random()
        } else {
            password += charRange.random()
        }
        isNumber = !isNumber //Меняю значение переменной, чтобы числа и спецсимволы чередовались
    }
    return password
}

fun main() {
    val passwordLength: Int = readln().toInt()
    val password: String = generatePassword(passwordLength)
    println(password)
}
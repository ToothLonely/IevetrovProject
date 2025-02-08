package org.example.lesson_1_10.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY: Byte = 18

fun main() {
    print("Введите год своего рождения: ")

    //Определение текущего года, и вычисления возраста пользователя
    val currentYear = LocalDate.now().year
    val userBirthYear: Short = readln().toShort()
    val userAge: Byte = (currentYear - userBirthYear).toByte()

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Не дорос такое смотреть")
    }
}
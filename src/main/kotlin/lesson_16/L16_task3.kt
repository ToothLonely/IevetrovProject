package org.example.lesson_16

class Person {
    private val password = "qwerty"
    private val login = "abc"

    fun checkPassword(inputPassword: String) = (inputPassword == password)
}

fun main() {
    val person = Person()
    print("Введите пароль: ")
    val inputPassword = readln()

    val isCorrect = when (person.checkPassword(inputPassword)) {
        true -> println("Пароль верный")
        false -> println("Пароль не верный")
    }

    return isCorrect
}
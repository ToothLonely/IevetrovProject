package org.example.lesson_16

class Person {
    private val password = "qwerty"
    private val login = "abc"

    fun getPassword(): String {
        return password
    }
}

fun checkPassword(password: String, inputPassword: String) = (inputPassword == password)

fun main() {
    val person = Person()
    print("Введите пароль: ")
    val inputPassword = readln()
    val password = person.getPassword()

    val isCorrect = when (checkPassword(password, inputPassword)) {
        true -> println("Пароль верный")
        false -> println("Пароль не верный")
    }

    return isCorrect
}
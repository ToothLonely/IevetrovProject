package org.example.lesson_10

fun checkPasswordLength(password: String, minimumPasswordLength: Int) = password.length >= minimumPasswordLength

fun checkLoginLength(login: String, minimumLoginLength: Int) = login.length >= minimumLoginLength

fun main() {
    val minimumPasswordLength = 4
    val minimumLoginLength = 4

    print("Введите логин (не менее 4 символов): ")
    val login: String = readln()
    print("Введите пароль (не менее 4 символов): ")
    val password: String = readln()

    if (checkLoginLength(login, minimumLoginLength) && checkPasswordLength(password, minimumPasswordLength)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }

}
package org.example.lesson_10

fun validatePasswordAndLogin(login: String, password: String) {
    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}

fun main() {
    print("Введите логин (не менее 4 символов): ")
    val login: String = readln()
    print("Введите пароль (не менее 4 символов): ")
    val password: String = readln()
    validatePasswordAndLogin(login, password)
}
package org.example.lesson_10

fun validatePasswordAndLogin(login: String, password: String): Boolean {
    val passwordLength = 4
    val loginLength = 4
    if (login.length < loginLength || password.length < passwordLength) {
        return false
    } else {
        return true
    }
}

fun main() {
    print("Введите логин (не менее 4 символов): ")
    val login: String = readln()
    print("Введите пароль (не менее 4 символов): ")
    val password: String = readln()
    if (validatePasswordAndLogin(login, password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }

}
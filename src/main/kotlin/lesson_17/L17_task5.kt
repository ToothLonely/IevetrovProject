package org.example.lesson_17

class User(
    _login: String,
    _password: String
) {
    private val passwordLength = _password.length
    var login = _login
        set(value) {
            field = value
            println("Вы успешно сменили логин на $field!")
        }
    var password
        get() = "*".repeat(passwordLength)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("X", "SuperSecretPassword")

    println(user.password)
    user.password = "NewSecretPassword"
    println(user.password)
    user.login = "Y"
}
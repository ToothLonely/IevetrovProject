package org.example.lesson_1_10.lesson_6

fun main() {
    //Регистрация
    print("Введите логин для регистрации ")
    val login: String = readln()
    print("Введите пароль для регистрации ")
    val password: String = readln()

    //Вход
    var enterLogin: String
    var enterPassword: String
    var errorCounter: Byte = 0
    do {
        if (errorCounter > 0) {
            println("Неверно введены логин или пароль. Попробуйте еще!")
        }
        print("Введите логин для входа ")
        enterLogin = readln()
        print("Введите пароль для входа ")
        enterPassword = readln()
        errorCounter++
    } while (enterLogin != login || enterPassword != password)
    println("Вы успешно вошли под логином $login")
}
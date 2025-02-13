package org.example.lesson_11.lesson_11_2

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = ""
) {
    fun printProperties() {
        println("id = $id, login = $login, password = $password, mail = $mail, bio = $bio")
    }

    fun setBio() {
        println("Расскажите о себе: ")
        bio = readln()
    }

    fun setPassword() {
        println("Подтвердите пароль: ")
        if (readln() == password) {
            println("Пароль введен верно. Введите новый: ")
            password = readln()
        } else {
            println("Пароль введен не верно!")
        }
    }
}
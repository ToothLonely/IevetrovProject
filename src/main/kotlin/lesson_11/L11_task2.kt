package org.example.lesson_11

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

    fun setBio(bio: String) = apply { this.bio = bio }

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

fun main() {
    val Ivan = User2(3, "Ivan", "qwerty", "Ivan@mail.ru")
    val bio = "Меня зовут Иван и мой старый пароль qwerty"

    Ivan.setBio(bio)
    Ivan.setPassword()
    Ivan.printProperties()
}

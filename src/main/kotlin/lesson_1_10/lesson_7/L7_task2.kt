package org.example.lesson_1_10.lesson_7

fun main() {
    var password: Short
    var enterPassword: Short

    //Здесь лучше подходит цикл while, но тема for поэтому пришлось поставить его
    for (i in 0..10) {
        password = (1000..9999).random().toShort()
        println("Ваш код авторизации: $password")

        print("Введите четырехзначный код для авторизации: ")
        enterPassword = readln().toShort()

        if (enterPassword != password) {
            println("Код введен неверно. Попробуйте снова")
        } else {
            println("Добро пожаловать!")
            break
        }
    }
}
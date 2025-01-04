package org.example.lesson_5

fun main() {
    val myName = "Zaphod"
    val myPassword = "PanGalactic"
    val newUserName: String
    val newUserPassword: String

    print("Введите имя пользователя: ")
    val inputName: String = readln()
    val inputPassword: String

    //Аутентификация пользователя
    if (inputName == myName) {
        print("Введите пароль: ")
        inputPassword = readln()
        if (inputPassword == myPassword) {
            println("Welcome, $myName!")
        } else {
            println("Wrong password!")
        }
    } else { //Процесс регистрации нового пользователя
        println("You must sign in...")
        print("Enter your name: ")
        newUserName = readln()
        print("Enter your password: ")
        newUserPassword = readln()
        println("registration was successful. Your name: $newUserName, your password: $newUserPassword")
    }
}
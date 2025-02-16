package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: Int,
    val mail: String,
)

fun main() {
    val Tarakan = User(1, "Tarakan", 12345, "tarakan@mail.ru")
    val Klop = User(2, "Klop", 67890, "Klop@mail.ru")

    println("Пользователь Tarakan: ")
    println("id = ${Tarakan.id}, login = ${Tarakan.login}, password = ${Tarakan.password}, mail = ${Tarakan.mail}")
    println("Пользователь Klop: ")
    println("id = ${Klop.id}, login = ${Klop.login}, password = ${Klop.password}, mail = ${Klop.mail}")
}
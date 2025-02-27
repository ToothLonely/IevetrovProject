package org.example.lesson_15

abstract class User(
    val id: Int,
    val name: String
) {
    fun sendMessage(message: String) {
        println("Пользователь с ID = $id и ником $name отправил сообщение: $message")
    }
}

class Member(id: Int, name: String) : User(id, name)

class Admin(id: Int, name: String) : User(id, name) {
    fun deleteMessage(message: String) {
        println("Администратор $name удалил сообщение: \"$message\"")
    }

    fun deleteMember(_name: String) {
        println("Администратор $name удалил пользователя $_name")
    }
}

fun main() {
    val user1 = Member(1, "user1")
    val user2 = Member(2, "user2")
    val admin1 = Admin(1, "admin1")
    val admin2 = Admin(2, "admin2")

    user1.sendMessage("Привет, я user1")
    user2.sendMessage("Привет, я user2")

    admin1.sendMessage("Привет, я admin1")
    admin2.deleteMessage("Привет, я user1")
    admin1.deleteMember("user2")
}
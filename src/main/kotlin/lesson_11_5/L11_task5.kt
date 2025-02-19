package org.example.lesson_11_5

class Forum {

    val listOfMembers: MutableList<Member> = mutableListOf()
    val listOfMessages: MutableList<Message> = mutableListOf()

    var authorId: Int = 0
    var message: String = ""
    var userId: Int = 0
    var userName: String = ""

    fun setUserId(newId: Int): Int {
        userId = newId
        return userId
    }

    fun setUserName(newUserName: String): String {
        userName = newUserName
        return userName
    }

    fun buildMember(id: Int, userName: String): Member {
        return Member(setUserId(id), setUserName(userName))
    }

    fun createNewUser(id: Int, userName: String): Member {

        val newMember = Forum().buildMember(id, userName)

        listOfMembers.add(newMember)

        return newMember
    }

    fun setAuthorId(newAuthorId: Int): Int {
        authorId = newAuthorId
        return authorId
    }

    fun setMessage(newMessage: String): String {
        message = newMessage
        return message
    }

    fun buildMessage(Id: Int, payload: String): Message {
        return Message(setAuthorId(Id), setMessage(payload))
    }

    fun createNewMessage(id: Int, payload: String): Message? {
        if (id > listOfMembers.size) {
            println("Нет такого пользователя!")
            return null
        } else {
            val newMessage = Forum().buildMessage(id, payload)

            listOfMessages.add(newMessage)

            return newMessage
        }
    }

    fun printThread() {
        for (message in listOfMessages) {
            for (member in listOfMembers) {
                if (message.authorId == member.userID) {
                    println("${member.userName} : ${message.message}")
                }
            }
        }
    }
}

data class Member(
    val userID: Int,
    val userName: String,
)

data class Message(
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()

    forum.createNewUser(1, "Иван")
    forum.createNewUser(2, "Никита")
    forum.createNewUser(3, "Виктор")
    forum.createNewUser(4, "Махмуд")

    forum.createNewMessage(1, "Привет")
    forum.createNewMessage(2, "Привет")
    forum.createNewMessage(3, "Привет")
    forum.createNewMessage(1, "Как дела?")
    forum.createNewMessage(3, "Нормально,а у тебя?")
    forum.createNewMessage(1, "У меня тоже")
    forum.createNewMessage(4, "А у меня все плохо")

    forum.printThread()
}
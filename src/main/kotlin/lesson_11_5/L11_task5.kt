package org.example.lesson_11_5

class Forum {

    val listOfMembers: MutableList<Member> = mutableListOf()
    val listOfMessages: MutableList<Message> = mutableListOf()

    fun createNewUser(userName: String): Member {
        val newMember = MemberBuilder()
            .increaseUserId()
            .setUserName(userName)
            .build()

        listOfMembers.add(newMember)

        return newMember
    }

    fun createNewMessage(authorId: Int, payload: String): Message? {
        if (authorId > listOfMembers.size) {
            println("Нет такого пользователя!")
            return null
        } else {
            val newMessage = MessageBuilder()
                .setAuthorId(authorId)
                .setMessage(payload)
                .build()

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

var userId: Int = 0 //Пришлось создать глобальную переменную,
// чтобы можно было увеличивать Id пользователя при его создании

class MemberBuilder {
    var userName: String = ""

    fun increaseUserId() = apply { userId++ }

    fun setUserName(newUserName: String) = apply { this.userName = newUserName }

    fun build(): Member {
        return Member(userId, userName)
    }
}

class MessageBuilder {
    var authorId: Int = 0
    var message: String = ""

    fun setAuthorId(newAuthorId: Int) = apply { this.authorId = newAuthorId }

    fun setMessage(newMessage: String) = apply { this.message = newMessage }

    fun build(): Message {
        return Message(authorId, message)
    }
}

fun main() {
    val forum = Forum()

    forum.createNewUser("Иван")
    forum.createNewUser("Никита")
    forum.createNewUser("Виктор")
    forum.createNewUser("Махмуд")

    forum.createNewMessage(1, "Привет")
    forum.createNewMessage(2, "Привет")
    forum.createNewMessage(3, "Привет")
    forum.createNewMessage(1, "Как дела?")
    forum.createNewMessage(3, "Нормально,а у тебя?")
    forum.createNewMessage(1, "У меня тоже")
    forum.createNewMessage(4, "А у меня все плохо")

    forum.printThread()
}
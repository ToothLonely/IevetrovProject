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

    val user1 = forum.createNewUser("Иван")
    val user2 = forum.createNewUser("Никита")
    val user3 = forum.createNewUser("Виктор")
    val user4 = forum.createNewUser("Махмуд")

    val message1 = forum.createNewMessage(1, "Привет")
    val message2 = forum.createNewMessage(2, "Привет")
    val message3 = forum.createNewMessage(3, "Привет")
    val message4 = forum.createNewMessage(1, "Как дела?")
    val message5 = forum.createNewMessage(3, "Нормально,а у тебя?")
    val message6 = forum.createNewMessage(1, "У меня тоже")
    val message7 = forum.createNewMessage(4, "А у меня все плохо")

    forum.printThread()
}
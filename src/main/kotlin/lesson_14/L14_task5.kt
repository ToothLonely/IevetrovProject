package org.example.lesson_14

open class Message(
    val author: String,
    var messageId: Int,
    val payload: String,
) {
    var printFlag = true //Добавил флаг, чтобы не печатать тредовое сообщение дважды
}

class ChildMessage(
    author: String,
    messageId: Int,
    payload: String,
    val parentMessageId: Int? = null,
) : Message(author, messageId, payload)

class Chat {
    val listOfMessages: MutableList<Message> = mutableListOf()
    var messageIdCounter: Int = 0

    fun addMessage(author: String, text: String): MutableList<Message> {
        listOfMessages.add(ChildMessage(author, ++messageIdCounter, text))
        return listOfMessages
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int): MutableList<Message> {
        listOfMessages.add(ChildMessage(author, ++messageIdCounter, text, parentMessageId))
        return listOfMessages
    }

    fun printChat() {
        val groupedMessages = listOfMessages.groupBy { it.messageId }
        val groupedChildMessages = listOfMessages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }

        for (i in groupedMessages) {
            if (i.value[0].printFlag) {
                println("${i.value[0].author}: ${i.value[0].payload}") //берется индекс 0, т.к. id каждого сообщения
                // уникальный, значит в списке будет только один объект
            }
            if (i.key in groupedChildMessages.keys) {
                groupedChildMessages[i.key]?.forEach {
                    println("    ${it.author}: ${it.payload}")
                    it.printFlag = false //После печати тредового сообщения ставлю флаг на false,
                    // чтобы потом не печатать это сообщение как обычное
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Виктор", "Всем привет, как дела? Как отдохнули?")
    chat.addThreadMessage("Кирилл", "Привет, все хорошо, а ты?", 1)
    chat.addThreadMessage("Виктор", "Я тоже", 1)
    chat.addMessage("Кирилл", "Чья сегодня смена?")
    chat.addThreadMessage("Петр", "Твоя", 4)
    chat.addThreadMessage("Кирилл", "Точно, забыл", 4)

    chat.printChat()
}

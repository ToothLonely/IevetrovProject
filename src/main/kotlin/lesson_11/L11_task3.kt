package org.example.lesson_11

class Room(
    val roomName: String,
    val listOfParticipant: MutableList<Participant>,
    val roomAvatar: String = "cover_image.png",
) {
    fun addUser(newParticipant: Participant): MutableList<Participant> {
        if (newParticipant in listOfParticipant) {
            println("Этот пользователь уже в комнате")
        } else {
            listOfParticipant.add(newParticipant)
        }
        return listOfParticipant
    }

    fun setStatus(participant: Participant, newStatus: Status): Status {
        participant.status = newStatus
        return participant.status
    }

    fun printListOfParticipant() {
        val lastParticipant = listOfParticipant.last()
        for (participant in listOfParticipant) {
            if (participant == lastParticipant) {
                print("${participant.userName}")
            } else {
                print("${participant.userName}, ")
            }
        }
        println()
    }
}

class Participant(
    val userName: String,
    var status: Status,
    val userAvatar: String = "avatar_image.png",
)

enum class Status(
    val description: String
) {
    TALKING("разговаривает"),
    MICRO_MUTED("микрофон выключен"),
    USER_MUTED("пользователь заглушен")
}

fun main() {
    val room1 = Room(
        "Экономика", mutableListOf(
            Participant("Владимир Чистюхин", Status.TALKING),
            Participant("Дмитрий Тулин", Status.MICRO_MUTED),
            Participant("Ольга Скоробогатова", Status.USER_MUTED),
        )
    )

    println("Название комнаты: ${room1.roomName}")
    println("Список участников: ")
    room1.printListOfParticipant()
    println(
        "Нажимаем на аватар первого участника и удерживаем: " +
                "${room1.listOfParticipant[0].userName}, ${room1.listOfParticipant[0].status.description}"
    )

    println()

    val newParticipant = Participant("Эльвира Набиуллина", Status.USER_MUTED)
    room1.addUser(newParticipant)
    println("В комнату вошел новый участник. Новый список: ")
    room1.printListOfParticipant()

    println("Статус нового участника: ${newParticipant.status.description}")
    room1.setStatus(newParticipant, Status.TALKING)
    println("Новый участник решил говорить. Статус нового участника: ${newParticipant.status.description}")
}

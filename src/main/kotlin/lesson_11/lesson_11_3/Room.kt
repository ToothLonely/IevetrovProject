package org.example.lesson_11.lesson_11_3

class Room(
    val roomName: String,
    val listOfParticipant: MutableList<Participant>,
    val roomAvatar: String = "cover_image.png",
) {
    fun addUser(newParticipant: Participant): MutableList<Participant> {
        listOfParticipant.add(newParticipant)
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
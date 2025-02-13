package org.example.lesson_11.lesson_11_3

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

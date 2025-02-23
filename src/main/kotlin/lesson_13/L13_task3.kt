package org.example.lesson_13

class Human(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {

    val listOfHumans = listOf(
        Human("Виктор", 8_800_555_35_35, "Микрозаймы"),
        Human("Дмитрий", 8_901_234_56_78),
        Human("Оксана", 8_923_532_34_98, "null"),
        Human("Варфоломей", 8_923_988_29_93),
        Human("Митрофан", 8_930_030_03_00, "Трактористы")
    )

    listOfHumans.mapNotNull { it.company }.distinct().forEach {
        println(it)
    }

}
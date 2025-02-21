package org.example.lesson_13

class Person(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println(
            "Имя: $name \n" +
            "Номер телефона: $phoneNumber \n" +
            "Компания: ${company ?: "<не указано>"}"
        )
    }
}

fun main() {
    val person1 = Person("Виктор", 8_800_555_35_35, "Микрозаймы")
    val person2 = Person("Дмитрий", 8_901_234_56_78)
    person1.printInfo()
    person2.printInfo()
}
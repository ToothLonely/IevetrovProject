package org.example.lesson_13

class ContactData(
    var name: String,
    var phoneNumber: Long?,
    var company: String? = null,
)

fun main() {
    val phoneBook: MutableList<ContactData> = mutableListOf()
    var answer = "Да"
    var inputName: String
    var inputPhoneNumber: Long?
    var inputCompany: String?

    while (answer.equals("да", ignoreCase = true)) {
        println("Введите данные пользователя: ")
        inputName = readln()
        inputPhoneNumber = readlnOrNull()?.toLongOrNull()
        inputCompany = readlnOrNull().takeIf { !it.isNullOrBlank() }

        if (inputPhoneNumber == null) {
            println("Вы не ввели номер телефона")
        } else {
            phoneBook.add(ContactData(inputName, inputPhoneNumber, inputCompany))
        }

        println("Добавить еще? (Да/Нет)")
        answer = readln()
    }

    phoneBook.forEach { println("${it.name}, ${it.phoneNumber}, ${it.company}") }
}
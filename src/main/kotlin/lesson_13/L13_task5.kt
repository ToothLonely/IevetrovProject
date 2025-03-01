package org.example.lesson_13

class ContactInfo(
    var name: String = "",
    var phoneNumber: Long? = 0,
    var company: String? = null,
) {
    fun setPhoneNumber(): Long? {

        phoneNumber = try {
            readln().toLong()
        } catch (e: NumberFormatException) {
            println("Произошла ошибка: ${e::class.simpleName}"); 0
        }

        return phoneNumber
    }
}

fun main() {
    val contact = ContactInfo()

    print("Введите номер телефона: ")
    contact.setPhoneNumber()
    println("Номер телефона: ${contact.phoneNumber}")
}
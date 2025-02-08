package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun authorization(password: String, login: String): Boolean? {
    print("Введите логин для входа: ")
    val inputLogin = readln()
    print("Введите пароль для входа: ")
    val inputPassword = readln()
    if (login == inputLogin && password == inputPassword) {
        return true
    } else {
        return null
    }
}

fun generateJWT(): String {
    val intRange = 0..9
    val charRange = 'a'..'z'
    var header = ""
    val headerLength = 9
    var payload = ""
    val payloadLength = 13
    var signature = ""
    val signatureLength = 10
    val token: String

    var isNumber: Boolean = Random.nextBoolean() //Рандомно выбираю что будет первым, число или буква
    for (i in 0 until headerLength) {
        if (isNumber) {
            header += intRange.random()
        } else {
            header += charRange.random()
        }
        isNumber = !isNumber //Меняю значение переменной, чтобы числа и буквы чередовались
    }

    isNumber = Random.nextBoolean()
    for (i in 0 until payloadLength) {
        if (isNumber) {
            payload += intRange.random()
        } else {
            payload += charRange.random()
        }
        isNumber = !isNumber
    }

    isNumber = Random.nextBoolean()
    for (i in 0 until signatureLength) {
        if (isNumber) {
            signature += intRange.random()
        } else {
            signature += charRange.random()
        }
        isNumber = !isNumber
    }

    token = header + '.' + payload + '.' + signature
    return token
}

fun getBucket(token: String): Array<Any> {
    val bucketList: Array<Any> = arrayOf("компьютерная мышь", "монитор", "клавиатура")
    return bucketList
}

fun main() {
    val login = "admin"
    val password = "qwerty"
    val token: String

    if (authorization(password, login) == true) {
        println("Вы вошли под логином: $login")
        token = generateJWT()
        println("Ваша корзина: ")
        getBucket(token).forEach {
            print("$it, ")
        }
    } else {
        println("Неудачная попытка входа. Вы мошенник!")
    }

}
package org.example.lesson_7

fun main() {
    var password = ""
    for (i in 0..5) {
        if (i % 2 == 0) {
            password += (0..9).random()
        } else {
            password += ('a'..'z').random()
        }
    }
    println(password)
}
package org.example.lesson_1_10.lesson_7

fun main() {
    val numberRange: IntRange = (0..9)
    val charRange: CharRange = ('a'..'z')
    var password = ""
    for (i in 0..5) {
        if (i % 2 == 0) {
            password += numberRange.random()
        } else {
            password += charRange.random()
        }
    }
    println(password)
}
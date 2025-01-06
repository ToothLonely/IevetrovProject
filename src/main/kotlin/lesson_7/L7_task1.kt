package org.example.lesson_7

fun main() {
    for (i in 0..5) {
        if (i % 2 == 0) {
            print((0..9).random())
        } else {
            print(('a'..'z').random())
        }
    }
}
package org.example.lesson_7

fun main() {
    print("Введите число: ")
    val inputNumber: Int = readln().toInt()

    for (i in 0..inputNumber step 2) {
        print("$i ")
    }
}
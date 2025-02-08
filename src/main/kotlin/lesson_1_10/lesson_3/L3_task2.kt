package org.example.lesson_1_10.lesson_3

fun main() {
    val fname: String = "Татьяна"
    var sname: String = "Андреева"
    val tname: String = "Сергеевна"
    var age: Byte = 20

    println("$sname $fname $tname, $age")

    sname = "Сидорова"
    age = 22

    println("$sname $fname $tname, $age")
}
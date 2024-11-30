package org.example.lesson_2

fun main() {
    val studentMark1: Byte = 3
    val studentMark2: Byte = 4
    val studentMark3: Byte = 3
    val studentMark4: Byte = 5
    val numberOfStudents: Byte = 4

    //Вычисление среднего балла
    val avgRating: Float = (studentMark1 + studentMark2 + studentMark3 + studentMark4).toFloat() / numberOfStudents

    println(String.format("%.2f", avgRating))
}
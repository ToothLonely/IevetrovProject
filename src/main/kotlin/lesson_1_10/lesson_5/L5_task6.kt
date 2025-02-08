package org.example.lesson_1_10.lesson_5

const val CENTIMETRES_IN_METRE: Byte = 100

fun main() {
    val weight: Double = readln().toDouble()
    val height: Float = readln().toFloat()
    val heightInMetres: Float = height / CENTIMETRES_IN_METRE
    val BMI: Double = weight / (heightInMetres * heightInMetres) //body mass index
    val formattedBMI: String = String.format("%.2f", BMI)

    if (BMI < 18.5) {
        println("ИМТ:$formattedBMI. Недостаточная масса тела")
    } else if (BMI >= 18.5 && BMI < 25) {
        println("ИМТ:$formattedBMI. Нормальная масса тела")
    } else if (BMI >= 25 && BMI < 30) {
        println("ИМТ:$formattedBMI. Избыточная масса тела")
    } else if (BMI > 30) {
        println("ИМТ:$formattedBMI. Ожирение")
    }
}
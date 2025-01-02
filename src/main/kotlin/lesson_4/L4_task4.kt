package org.example.lesson_4

fun main() {
    var dayCount: Byte = 5
    val isBackAndLegDay: Boolean = dayCount % 2 == 0

    println(
        "Упражнения для рук: ${!isBackAndLegDay} \n" +
        "Упражнения для ног: $isBackAndLegDay \n" +
        "Упражнения для спины: $isBackAndLegDay \n" +
        "Упражнения для пресса: ${!isBackAndLegDay}"
    )
}
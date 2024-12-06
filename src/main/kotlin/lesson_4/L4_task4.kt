package org.example.lesson_4

fun main() {
    var dayCount: Byte = 5
    val isArmAndAbdonimalDay: Boolean = dayCount % 2 == 1
    val isBackAndLegDay: Boolean = dayCount % 2 == 0

    println(
        "Упражнения для рук: $isArmAndAbdonimalDay \n" +
        "Упражнения для ног: $isBackAndLegDay \n" +
        "Упражнения для спины: $isBackAndLegDay \n" +
        "Упражнения для пресса: $isArmAndAbdonimalDay"
    )
}
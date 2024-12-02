package org.example.lesson_4

fun main() {
    var dayCount: Byte = 5
    val isArmDay: Boolean = dayCount % 2 == 1
    val isAbdonimalDay: Boolean = dayCount % 2 == 1
    val isBackDay: Boolean = dayCount % 2 == 0
    val isLegDay: Boolean = dayCount % 2 == 0

    println(
        "Упражнения для рук: $isArmDay \n" +
        "Упражнения для ног: $isLegDay \n" +
        "Упражнения для спины: $isBackDay \n" +
        "Упражнения для пресса: $isAbdonimalDay"
    )
}
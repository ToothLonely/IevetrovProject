package org.example.lesson_9

fun main() {
    val numberOfIngredients: List<Int> = listOf(2, 50, 15)

    print("Сколько порций необходимо приготовить? ")
    val numberOfServings: Int = readln().toInt()

    print("На $numberOfServings порций вам понадобится: ")
    for (i in 0 until numberOfIngredients.size) {
        when (i) {
            0 -> print("Яиц - ${numberOfIngredients[i] * numberOfServings} шт, ")
            1 -> print("молока - ${numberOfIngredients[i] * numberOfServings} мл, ")
            2 -> print("сливочного масла - ${numberOfIngredients[i] * numberOfServings} гр ")
        }
    }
}

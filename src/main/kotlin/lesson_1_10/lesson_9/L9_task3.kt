package org.example.lesson_1_10.lesson_9

fun main() {
    val numberOfIngredientsPerServing: List<Int> = listOf(2, 50, 15)

    print("Сколько порций необходимо приготовить? ")
    val numberOfServings: Int = readln().toInt()

    print("На $numberOfServings порций вам понадобится: ")
    val numberOfAllIngredients = numberOfIngredientsPerServing.map {
        it * numberOfServings
    }

    for (i in 0 until numberOfAllIngredients.size) {
        when (i) {
            0 -> print("Яиц - ${numberOfAllIngredients[i]} шт, ")
            1 -> print("молока - ${numberOfAllIngredients[i]} мл, ")
            2 -> print("сливочного масла - ${numberOfAllIngredients[i]} гр ")
        }
    }
}

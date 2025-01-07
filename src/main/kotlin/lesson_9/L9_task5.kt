package org.example.lesson_9

fun main() {
    val ingredients: MutableList<String> = mutableListOf()
    var totalIngredients: Int = 0

    //Заполнение списка с проверкой на уникальность на каждой итерации
    while (totalIngredients < 5) {
        println("Введите ${++totalIngredients}-й ингредиент")
        ingredients.add(readln())
        if (ingredients.distinct().size != ingredients.size) {
            println("Внимание! Каждый ингредиент должен быть уникальным.")
            ingredients.removeLast()
            totalIngredients--
        }
    }

    // Вывод списка в консоль
    println("Ваш список ингредиентов: ")
    print(ingredients.sorted().joinToString(", ") {
        if (it == ingredients.sorted().first()) {
            it.replaceFirstChar(Char::uppercaseChar)
        } else {
            it
        }
    })
}
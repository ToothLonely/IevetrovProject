package org.example.lesson_1_10.lesson_9

fun main() {
    val ingredients: MutableList<String> = mutableListOf("лук", "зелень", "рис")
    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach { ingredient: String ->
        print("$ingredient ")
    }

    print("\nЖелаете добавить еще? ")
    if (readln().equals("Да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient: String = readln()
        ingredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты:")
        ingredients.forEach { ingredient: String ->
            print("$ingredient ")
        }
    }
}

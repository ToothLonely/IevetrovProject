package org.example.lesson_9

fun main() {
    //Создание списка и вывод
    val ingredients: MutableList<String> = mutableListOf("лук", "зелень", "рис")
    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach { ingredient: String ->
        print("$ingredient ")
    }

    //Проверка на добавление нового ингредиента
    print("\nЖелаете добавить еще? ")
    if (readln().equals("Да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient: String = readln()
        ingredients.add(newIngredient)

        //Вывод обновленного списка
        println("Теперь в рецепте есть следующие ингредиенты:")
        ingredients.forEach { ingredient: String ->
            print("$ingredient ")
        }
    } else {
        return
    }
}

package org.example.lesson_5

fun main() {
    //Список чисел, которые надо отгадать.
    val numbers: List<Byte> = arrayListOf(
        (0..42).random().toByte(),
        (0..42).random().toByte(),
        (0..42).random().toByte()
    )

    //Создание списка введенных чисел
    val inputNumbers: MutableList<Byte> = mutableListOf()
    print("Введите первое число [0;42]: ")
    inputNumbers.add(readln().toByte())
    print("Введите второе число [0;42]: ")
    inputNumbers.add(readln().toByte())
    print("Введите третье число [0;42]: ")
    inputNumbers.add(readln().toByte())

    //Проверка совпадений
    val guessedNumbers: Set<Byte> = inputNumbers intersect numbers
    val countGuessedNumbers: Int = guessedNumbers.size
    when (countGuessedNumbers) {
        0 -> println("Вы не угадали ни одного числа. Попробуйте еще раз!")
        1 -> println("Вы отгадали 1 число. Вам полагается утешительный приз!")
        2 -> println("Вы отгадали 2 числа. Вы получаете крупный приз!")
        3 -> println("Вы отгадали 3 числа. Вы сорвали джекпот!")
    }

    println("Загаданные числа: $numbers")
    println("Отгаданные числа: $guessedNumbers")
}
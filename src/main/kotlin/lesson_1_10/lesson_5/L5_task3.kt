package org.example.lesson_1_10.lesson_5

fun main() {
    //Создание выигрышных чисел. Будем считать, что они уникальны
    val firstNumber: Byte = (0..42).random().toByte()
    val secondNumber: Byte = (0..42).random().toByte()

    print("Введите первое число [0;42]: ")
    val firstInputNumber: Byte = readln().toByte()
    print("Введите второе число [0;42]: ")
    val secondInputNumber: Byte = readln().toByte()

    println("Необходимо было ввести: $firstNumber и $secondNumber")

    //Проверка введенных чисел с загаданными.
    //Добавил проверку на совпадение введенных чисел,
    //чтобы не выводило полный выигрыш, если два введенных числа равны только одному из загаданных чисел
    if (firstInputNumber == firstNumber || firstInputNumber == secondNumber) {
        when ((secondInputNumber != firstInputNumber) &&
                (secondInputNumber == secondNumber || secondInputNumber == firstNumber)) {
            true -> println("Поздравляем! Вы выиграли главный приз!")
            false -> println("Вы выиграли утешительный приз!")
        }
    } else if (secondInputNumber == firstNumber || secondInputNumber == secondNumber) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

}
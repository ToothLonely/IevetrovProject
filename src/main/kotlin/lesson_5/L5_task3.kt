package org.example.lesson_5

fun main() {
    val firstNumber: Byte = (0..42).random().toByte()
    val secondNumber: Byte = (0..42).random().toByte()

    print("Введите первое число [0;42]: ")
    val firstInputNumber: Byte = readln().toByte()
    print("Введите второе число [0;42]: ")
    val secondInputNumber: Byte = readln().toByte()

    println("Необходимо было ввести: $firstNumber и $secondNumber")

    //Проверка введенных чисел с целевыми
    if (firstInputNumber == firstNumber || firstInputNumber == secondNumber) {
        when ((secondInputNumber != firstInputNumber) &&//Добавил проверку на совпадение введеных чисел,
                //чтобы не выводило полный выигрыш, если два введеных числа равны только одному из целевых чисел
                //P.S. я не знаю можно ли писать комменты, обрывая код... надеюсь, что можно :)
                (secondInputNumber == secondNumber || secondInputNumber == firstNumber)) {
            true -> println("Поздравляем! Вы выиграли главный приз!")
            false -> println("Вы выиграли утешительный приз!")
        }
    } else {
        println("Неудача!")
    }
    //Этот код не учитывает ситуации, когда надо отгадать два одинаковых числа, например загадано 1 и 1,
    //(потому что это сильно усложнит код и сомневаюсь, что в лотереях такое случается)

}
package org.example.lesson_1_10.lesson_7

fun main() {
    print("На сколько секунд засечь таймер? ")
    val time: Int = readln().toInt()

    for (i in time downTo 1) {
        println("До конца осталось $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}
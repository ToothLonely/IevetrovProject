package org.example.lesson_6

const val MILLIS_IN_SECOND: Short = 1000

fun main() {
    print("На сколько секунд засечь таймер? ")
    var secondsCounter: Int = readln().toInt()
    while(secondsCounter != 0){
        println("Осталось секунд: ${secondsCounter--}")
        Thread.sleep(MILLIS_IN_SECOND.toLong())
    }
    println("Время вышло")
}
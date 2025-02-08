package org.example.lesson_1_10.lesson_10

fun rollTheDice(): Int {
    return (1..6).random()
}

fun playRound(humanMove: Int, robotMove: Int) {
    print("Ход человека: ")
    Thread.sleep(2000)
    println(humanMove)
    Thread.sleep(1000)

    print("Ход машины: ")
    Thread.sleep(2000)
    println(robotMove)
    Thread.sleep(1000)

    if (humanMove > robotMove) {
        println("Победило человечество")
    } else if (robotMove > humanMove) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
}

fun main() {
    val humanMove: Int = rollTheDice()
    val robotMove: Int = rollTheDice()
    playRound(humanMove, robotMove)
}
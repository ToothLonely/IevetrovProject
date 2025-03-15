package org.example.lesson_18

abstract class Dice {

    protected abstract val sides: Int

    private fun rollTheDice(): Int {
        println("Бросок...")
        return (1..sides).random()
    }

    fun printResult() {
        println("Выпало ${rollTheDice()}")
    }
}

class FourSidesDice : Dice() {
    override val sides = 4
}

class SixSidesDice : Dice() {
    override val sides = 6
}

class EightSidesDice : Dice() {
    override val sides = 8
}

fun main() {
    val dice4 = FourSidesDice()
    val dice6 = SixSidesDice()
    val dice8 = EightSidesDice()
    val listOfDices: List<Dice> = listOf(dice4, dice6, dice8)

    listOfDices.map { it.printResult() }
}

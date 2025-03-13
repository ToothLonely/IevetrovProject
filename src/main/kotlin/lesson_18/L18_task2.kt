package org.example.lesson_18

open class Dice(sides: Int) {

    private val resultsRange = 1..sides

    private fun rollTheDice(): Int {
        println("Бросок...")
        return resultsRange.random()
    }

    fun printResult() {
        println("Выпало ${rollTheDice()}")
    }
}

class FourSidesDice() : Dice(4)
class SixSidesDice() : Dice(6)
class EightSidesDice() : Dice(8)

fun main() {
    val dice4 = FourSidesDice()
    val dice6 = SixSidesDice()
    val dice8 = EightSidesDice()
    val listOfDices: List<Dice> = listOf(dice4, dice6, dice8)

    listOfDices.map { it.printResult() }
}

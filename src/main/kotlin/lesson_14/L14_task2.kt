package org.example.lesson_14

open class Liner2(
    val speed: Int = 100,
    val loadCapacity: Int = 40,
    val passengerCapacity: Int = 100,
) {
    open fun printInfo() {
        println("Скорость: $speed, грузоподъемность: $loadCapacity, вместимость: $passengerCapacity")
    }

    open fun printLoadMethod() {
        println("Выдвигает горизонтальный трап со шкафута")
    }
}

class Cargo2 : Liner2(80, 60, 80) {
    override fun printLoadMethod() {
        println("Активирует погрузочный кран")
    }
}

class Icebreaker2(
    val isBreakTheIce: Boolean = true
) : Liner2(50, 30, 50) {
    override fun printInfo() {
        println("Скорость: $speed, грузоподъемность: $loadCapacity, вместимость: $passengerCapacity, умение ломать лед: $isBreakTheIce")
    }

    override fun printLoadMethod() {
        println("Открывает ворота со стороны кормы.")
    }
}

fun main() {
    val liner = Liner2()
    val cargo = Cargo2()
    val icebreaker = Icebreaker2()

    println("Характеристики лайнера: ")
    liner.printInfo()
    liner.printLoadMethod()
    println("Характеристики грузового корабля: ")
    cargo.printInfo()
    cargo.printLoadMethod()
    println("Характеристики ледокола: ")
    icebreaker.printInfo()
    icebreaker.printLoadMethod()
}
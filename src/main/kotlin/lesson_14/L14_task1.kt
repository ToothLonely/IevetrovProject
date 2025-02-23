package org.example.lesson_14

open class Liner1(
    val speed: Int = 100,
    val loadCapacity: Int = 40,
    val passengerCapacity: Int = 100,
) {
    open fun printInfo() {
        println("Скорость: $speed, грузоподъемность: $loadCapacity, вместимость: $passengerCapacity")
    }
}

class Cargo1 : Liner1(80, 60, 80)

class Icebreaker1(
    val isBreakTheIce: Boolean = true
) : Liner1(50, 30, 50) {
    override fun printInfo() {
        println("Скорость: $speed, грузоподъемность: $loadCapacity, вместимость: $passengerCapacity, умение пробивать лед: $isBreakTheIce")
    }
}

fun main() {
    val liner = Liner1()
    val cargo = Cargo1()
    val icebreaker = Icebreaker1()

    liner.printInfo()
    cargo.printInfo()
    icebreaker.printInfo()
}
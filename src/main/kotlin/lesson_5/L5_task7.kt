package org.example.lesson_5

fun main() {
    val distance: Double = readln().toDouble()
    val fuelConsumption: Double = readln().toDouble()
    val fuelCostPerLiter: Float = readln().toFloat()

    val fullAmountOfFuel: Double = (distance * fuelConsumption) / 100
    val fullCostOfFuel: Double = fullAmountOfFuel * fuelCostPerLiter

    println("Количество необходимого топлива: $fullAmountOfFuel. " +
            "Итоговая стоимость поездки %.2f".format(fullCostOfFuel))
}
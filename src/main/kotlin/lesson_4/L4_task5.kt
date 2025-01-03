package org.example.lesson_4

const val MINIMUM_PASSENGERS: Byte = 55
const val MAXIMUM_PASSENGERS: Byte = 70
const val MINIMUM_PROVISION: Byte = 50

fun main() {
    var isDamage: Boolean = readlnOrNull()!!.toBoolean()
    var countPassengers: Int = readlnOrNull()!!.toInt()
    var countProvision: Int = readlnOrNull()!!.toInt()
    var isGoodWeather: Boolean = readlnOrNull()!!.toBoolean()

    //Проверка базового сценария условий
    var isBasicFavorableConditions: Boolean =
        !isDamage && (countPassengers in MINIMUM_PASSENGERS .. MAXIMUM_PASSENGERS)
                && (countProvision > MINIMUM_PROVISION) && isGoodWeather

    //Проверка альтернативного сценария условий
    var isAlternativeFavorableConditions: Boolean =
        (countPassengers == MAXIMUM_PASSENGERS.toInt()) && (countProvision >= MINIMUM_PROVISION) && isGoodWeather

    println("Можно ли отправляться в путь? ${isAlternativeFavorableConditions || isBasicFavorableConditions}")
}
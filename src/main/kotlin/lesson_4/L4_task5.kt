package org.example.lesson_4

const val MINIMUM_PASSENGERS: Byte = 55
const val MAXIMUM_PASSENGERS: Byte = 70
const val MINIMUM_PROVISION: Byte = 50
const val GOOD_WEATHER: Boolean = true
const val DAMAGE: Boolean = true

fun main() {
    val damage: Boolean = readln().toBoolean()
    val countPassengers: Int = readln().toInt()
    val countProvision: Int = readln().toInt()
    val weather: Boolean = readln().toBoolean()

    //Проверка базового сценария условий
    val isBasicFavorableConditions: Boolean =
        (damage != DAMAGE) && (countPassengers in MINIMUM_PASSENGERS .. MAXIMUM_PASSENGERS)
                && (countProvision > MINIMUM_PROVISION)

    //Проверка альтернативного сценария условий
    val isAlternativeFavorableConditions: Boolean =
        (countPassengers == MAXIMUM_PASSENGERS.toInt()) && (countProvision >= MINIMUM_PROVISION)
                && (weather == GOOD_WEATHER) && (damage == DAMAGE)

    println("Можно ли отправляться в путь? ${isAlternativeFavorableConditions || isBasicFavorableConditions}")
}
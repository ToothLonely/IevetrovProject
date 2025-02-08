package org.example.lesson_1_10.lesson_4

const val WEATHER: String = "sunny"
const val TENT: String = "open"
const val AIR_HUMIDITY: Byte = 20
const val NOT_SEASON: String = "winter"

fun main() {
    val currentWeather = "sunny"
    val currentTent = "open"
    val currentAirHumidity: Byte = 20
    val currentSeason = "winter"

    val isFavorableConditions: Boolean = (currentSeason != NOT_SEASON) && (currentTent == TENT) &&
            (currentAirHumidity == AIR_HUMIDITY) && (currentWeather == WEATHER)

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}
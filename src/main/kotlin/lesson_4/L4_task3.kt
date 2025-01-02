package org.example.lesson_4

const val WEATHER: String = "sunny"
const val TENT: String = "open"
const val AIR_HUMIDITY: Byte = 20
const val NOT_SEASON: String = "winter"

fun main(){
    var currentWeather: String = "sunny"
    var currentTent: String = "open"
    var currentAirHumidity: Byte = 20
    var currentSeason: String = "winter"

    var isWeatherSunny: Boolean = currentWeather == WEATHER
    var isTentOpen: Boolean = currentTent == TENT
    var isAirHumidity20: Boolean = currentAirHumidity == AIR_HUMIDITY
    var isSeasonNotWinter:  Boolean = currentSeason != NOT_SEASON
    var isFavorableConditions: Boolean = isSeasonNotWinter && isTentOpen && isAirHumidity20 && isWeatherSunny

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}
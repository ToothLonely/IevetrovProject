package org.example.lesson_12

class WeatherData(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    _isPrecipitation: Boolean
) {

    var dayTemperatureInCelsius = dayTemperatureInKelvin - 273
    var nightTemperatureInCelsius = nightTemperatureInKelvin - 273
    var isPrecipitation = _isPrecipitation

    fun printIndicators() {
        println("Температура днем: ${dayTemperatureInCelsius} ")
        println("Температура ночью: $nightTemperatureInCelsius")
        println("Наличие осадков: ${isPrecipitation}")
    }
}

fun main() {
    val day1 = WeatherData(300, 273, false)
    day1.printIndicators()
}
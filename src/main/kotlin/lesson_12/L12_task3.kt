package org.example.lesson_12

const val DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN = 273

class WeatherData(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    _isPrecipitation: Boolean
) {

    var dayTemperatureInCelsius = dayTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
    var nightTemperatureInCelsius = nightTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
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
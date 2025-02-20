package org.example.lesson_12

const val DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN = 273

class WeatherData(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    _isPrecipitation: Boolean
) {

    val dayTemperatureInCelsius = dayTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
    val nightTemperatureInCelsius = nightTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
    val isPrecipitation = _isPrecipitation

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
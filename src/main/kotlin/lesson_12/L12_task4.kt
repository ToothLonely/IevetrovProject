package org.example.lesson_12

//const val DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN = 273

class WeatherPredictions(
    dayTemperatureInKelvin: Int = 0,
    nightTemperatureInKelvin: Int = 0,
    _isPrecipitation: Boolean = false,
) {

    init {
        val dayTemperatureInCelsius = dayTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
        val nightTemperatureInCelsius = nightTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
        val isPrecipitation = _isPrecipitation

        println("Температура в цельсиях днем: $dayTemperatureInCelsius")
        println("Температура в цельсиях ночью: $nightTemperatureInCelsius")
        println("Наличие осадков: $isPrecipitation")
    }
}

fun main() {
    val day1 = WeatherPredictions(300, 273, true)
}
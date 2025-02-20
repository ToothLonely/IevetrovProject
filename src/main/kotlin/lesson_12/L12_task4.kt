package org.example.lesson_12

const val DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN = 273

class WeatherPrediction(
    val dayTemperatureInKelvin: Int = 0,
    val nightTemperatureInKelvin: Int = 0,
    val isPrecipitation: Boolean = false,
) {

    init {
        println("Температура в цельсиях днем: ${dayTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN}")
        println("Температура в цельсиях ночью: ${nightTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN}")
        println("Наличие осадков: ${isPrecipitation}")
    }
}

fun main() {
    val day1 = WeatherPrediction(300, 273, true)
}
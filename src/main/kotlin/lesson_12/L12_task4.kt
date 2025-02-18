package org.example.lesson_12

class WeatherPrediction() {

    var dayTemperatureInCelsius = 0
    var nightTemperatureInCelsius = 0
    var isPrecipitation = false

    constructor(dayTemperatureInKelvin: Int, nightTemperatureInKelvin: Int, _isPrecipitation: Boolean) : this() {

        dayTemperatureInCelsius = dayTemperatureInKelvin - 273
        nightTemperatureInCelsius = nightTemperatureInKelvin - 273
        isPrecipitation = _isPrecipitation

        println("Температура днем: ${dayTemperatureInCelsius} ")
        println("Температура ночью: $nightTemperatureInCelsius")
        println("Наличие осадков: ${isPrecipitation}")
    }
}

fun main() {
    val day1 = WeatherPrediction(300, 273, false)
}
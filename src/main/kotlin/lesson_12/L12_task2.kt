package org.example.lesson_12

class WeatherReport(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isPrecipitation: Boolean

) {
    fun printIndicators() {
        println("Температура днем: ${dayTemperature} ")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: ${isPrecipitation}")
    }
}

fun main() {
    val day1 = WeatherReport(-1, -10, false)
    day1.printIndicators()
}
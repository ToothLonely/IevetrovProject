package org.example.lesson_12

class Weather {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isPrecipitation: Boolean = false

    fun printIndicators() {
        println("Температура днем: ${dayTemperature} ")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: ${isPrecipitation}")
    }

}

fun main() {
    val day1 = Weather()
    day1.dayTemperature = 30
    day1.nightTemperature = 9
    day1.isPrecipitation = false
    day1.printIndicators()

    println()

    val day2 = Weather()
    day2.dayTemperature = 21
    day2.nightTemperature = 7
    day2.isPrecipitation = true
    day2.printIndicators()
}
package org.example.lesson_12

import kotlin.math.roundToInt
import kotlin.random.Random

//const val DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN = 273

class WeatherPrediction(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    _isPrecipitation: Boolean,
) {
    val dayTemperatureInCelsius = dayTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
    val nightTemperatureInCelsius = nightTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
    val isPrecipitation = _isPrecipitation
}

fun main() {
    val listOfTemperatureMeasurements: MutableList<WeatherPrediction> = mutableListOf()
    val temperatureRange = 260..300
    val numberOfDays = 30

    for (day in 0 until numberOfDays) {
        val dayTemperatureData = temperatureRange.random()
        val nightTemperatureData = temperatureRange.random()
        val precipitationData = Random.nextBoolean()

        listOfTemperatureMeasurements.add(
            WeatherPrediction(
                dayTemperatureData,
                nightTemperatureData,
                precipitationData
            )
        )
    }

    val averageDayTimeTemperature = listOfTemperatureMeasurements.map { it.dayTemperatureInCelsius }.average()
    val averageNightTimeTemperature = listOfTemperatureMeasurements.map { it.nightTemperatureInCelsius }.average()
    val numberOfDaysWithPrecipitation = listOfTemperatureMeasurements.count { it.isPrecipitation }

    println("Средняя температура днем: ${averageDayTimeTemperature.roundToInt()}")
    println("Средняя температура ночью: ${averageNightTimeTemperature.roundToInt()}")
    println("Количество дней с осадками: $numberOfDaysWithPrecipitation")
}
package org.example.lesson_12

import kotlin.math.roundToInt
import kotlin.random.Random

const val DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN = 273

class WeatherPrediction(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    _isPrecipitation: Boolean,
) {

    val dayTemperatureInCelsius = dayTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
    val nightTemperatureInCelsius = nightTemperatureInKelvin - DIFFERENCE_BETWEEN_CELSIUS_AND_KELVIN
    val isPrecipitation = _isPrecipitation

}

fun printAverageDayTimeTemperature(listOfTemperatureMeasurements: MutableList<WeatherPrediction>) {
    val dayTimeData = listOfTemperatureMeasurements.map { it.dayTemperatureInCelsius }
    val averageDayTimeTemperature = dayTimeData.average()
    println("Среднее значение температуры днем: ${averageDayTimeTemperature.roundToInt()}")
}

fun printAverageNightTimeTemperature(listOfTemperatureMeasurements: MutableList<WeatherPrediction>) {
    val nightTimeData = listOfTemperatureMeasurements.map { it.nightTemperatureInCelsius }
    val averageNightTimeTemperature = nightTimeData.average()
    println("Среднее значение температуры ночью: ${averageNightTimeTemperature.roundToInt()}")
}

fun printDaysWithPrecipitation(listOfTemperatureMeasurements: MutableList<WeatherPrediction>) {
    val numberOfDaysWithPrecipitation = listOfTemperatureMeasurements.count {
        it.isPrecipitation
    }
    println("Количество дней с осадками: $numberOfDaysWithPrecipitation")
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

    printAverageDayTimeTemperature(listOfTemperatureMeasurements)
    printAverageNightTimeTemperature(listOfTemperatureMeasurements)
    printDaysWithPrecipitation(listOfTemperatureMeasurements)

}
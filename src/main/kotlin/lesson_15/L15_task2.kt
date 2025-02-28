package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class Temperature(val degrees: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "температуре: $degrees градусов"
    }
}

class PrecipitationAmount(val amount: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "количестве осадков: $amount мм"
    }
}

class WeatherServer {
    fun sendData(weatherData: WeatherStationStats) {
        println("Получены данные о ${weatherData.getData()}")
    }
}

fun main() {
    val temp = Temperature(23.5)
    val amount = PrecipitationAmount(10.3)
    val weather = WeatherServer()

    weather.sendData(temp)
    weather.sendData(amount)
}
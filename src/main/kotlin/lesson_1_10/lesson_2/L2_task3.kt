package org.example.lesson_1_10.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    var hours: Byte = 9
    var minutes: Byte = 39
    val travelTime: Short = 457

    // Перевод в минуты времени отправки и времени прибытия
    val departTimeInMinutes: Int = hours * MINUTES_IN_HOUR + minutes
    val arriveTimeInMinutes: Int = departTimeInMinutes + travelTime

    // Перевод в часы и минуты для корректного отображения в формате времени
    minutes = (arriveTimeInMinutes / MINUTES_IN_HOUR).toByte()
    hours = (arriveTimeInMinutes % MINUTES_IN_HOUR).toByte()

    println(String.format("%02d:%02d", hours, minutes))
}

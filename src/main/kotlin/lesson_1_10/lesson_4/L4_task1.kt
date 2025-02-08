package org.example.lesson_1_10.lesson_4

fun main() {
    val allowTables: Byte = 13
    val todayBooking: Byte = 13
    val tomorrowBooking: Byte = 9
    val isFreeToday: Boolean = todayBooking < allowTables
    val isFreeTomorrow: Boolean = tomorrowBooking < allowTables

    println("Доступность столиков на сегодня: $isFreeToday, \n" +
            "Доступность столиков на завтра: $isFreeTomorrow")
}
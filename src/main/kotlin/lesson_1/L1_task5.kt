package lesson_1

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOURS = 60
const val SECONDS_IN_HOURS = 3600

fun main() {
    //Объявляю переменные
    val fullTimeInSeconds: Int = 6480
    val seconds: Int = fullTimeInSeconds % SECONDS_IN_MINUTE
    val minutes: Int = fullTimeInSeconds / SECONDS_IN_MINUTE % MINUTES_IN_HOURS
    val hours: Int = fullTimeInSeconds / SECONDS_IN_HOURS

    //Привожу данные к формату времени
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTime)
}

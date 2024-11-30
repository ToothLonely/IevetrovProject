package lesson_1

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTES_IN_HOUR

fun main() {

    val fullTimeInSeconds: Int = 6480
    val seconds: Int = fullTimeInSeconds % SECONDS_IN_MINUTE
    val minutes: Int = fullTimeInSeconds / SECONDS_IN_MINUTE % MINUTES_IN_HOUR
    val hours: Int = fullTimeInSeconds / SECONDS_IN_HOUR

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)
}

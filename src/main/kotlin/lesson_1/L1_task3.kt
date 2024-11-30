package lesson_1

fun main() {

    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println(year)
    println(String.format("%02d", hour))
    println("0$minute") // не знал какой вариант надо тут использовать,
    // поэтому просто использовал оба варианта

    hour = 10
    minute = 55

    println("$hour:$minute")
}

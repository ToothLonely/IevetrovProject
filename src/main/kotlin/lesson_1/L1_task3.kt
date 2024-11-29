package lesson_1

fun main() {
    //Объявляю переменные
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    //Вывожу год, час и минуты
    println(year)
    println(String.format("%02d", hour))
    println("0$minute") // не знал какой вариант надо тут использовать,
    // поэтому просто использовал оба варианта
    //Изменяю переменные
    hour = 10
    minute = 55

    //Вывод в формате времени
    println("$hour:$minute")
}

package org.example.lesson_2

fun main() {
    //Что-то мне подсказывает, что я не правильно понял задание :(
    val crystal: Byte = 7
    val iron: Byte = 11
    val buff: Float = 0.2f
    val ironBuff: Byte
    val crystalBuff: Byte // Как лучше делать? Как делал до этого,
    //сразу объявлял вычисляемые переменные и инициализировал в нижнем блоке
    //или объявить их вместе со всеми перменными в первом блоке, а инициализировать в нижнем блоке?

    //Вычисляю бафф на железо и кристалл
    ironBuff = (iron * buff).toInt().toByte()
    crystalBuff = (crystal * buff).toInt().toByte()

    println("Кристаллический бафф: $crystalBuff")
    println("Железный бафф: $ironBuff")
}
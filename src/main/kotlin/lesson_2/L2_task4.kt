package org.example.lesson_2

fun main() {
    //Что-то мне подсказывает, что я не правильно понял задание :(
    val crystal: Byte = 7
    val iron: Byte = 11
    val buff: Byte = 20
    val ironBuff: Byte
    val crystalBuff: Byte

    //Вычисляю бафф на железо и кристалл
    ironBuff = (iron * buff / 100).toByte()
    crystalBuff = (crystal * buff / 100).toByte()

    println("Кристаллический бафф: $crystalBuff")
    println("Железный бафф: $ironBuff")
}
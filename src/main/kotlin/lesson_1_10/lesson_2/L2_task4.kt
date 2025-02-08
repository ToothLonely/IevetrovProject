package org.example.lesson_1_10.lesson_2

const val FULl_PERCENT = 100

fun main() {
    val crystal: Byte = 7
    val iron: Byte = 11
    val buff: Byte = 20
    val ironBuff: Byte
    val crystalBuff: Byte

    //Вычисляю бафф на железо и кристалл
    ironBuff = (iron * buff / FULl_PERCENT).toByte()
    crystalBuff = (crystal * buff / FULl_PERCENT).toByte()

    println("Кристаллический бафф: $crystalBuff")
    println("Железный бафф: $ironBuff")
}
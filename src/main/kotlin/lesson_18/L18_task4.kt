package org.example.lesson_18

abstract class Box() {
    abstract fun calculateArea(): Int
}

class RectangularBox(
    private val length: Int,
    private val width: Int,
    private val height: Int
) : Box() {
    override fun calculateArea(): Int = 2 * (length * width + length * height + height * width)
}

class CubeBox(
    private val length: Int
) : Box() {
    override fun calculateArea(): Int = length * length * length
}

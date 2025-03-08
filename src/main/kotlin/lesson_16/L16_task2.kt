package org.example.lesson_16

class Circle(
    _radius: Int
) {
    private val radius = _radius
    private val PI = 3.14

    fun calculateArea() {
        println("Площадь равна: ${PI * radius * radius}")
    }

    fun calculateLength() {
        println("Длина круга равна: ${2 * PI * radius}")
    }
}

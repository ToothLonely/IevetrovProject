package org.example.lesson_14

abstract class Figure(
    val color: String
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Int
) : Figure(color) {
    override fun calculateArea(): Double {
        return kotlin.math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * kotlin.math.PI * radius
    }
}

class Rectangle(
    color: String,
    val length: Int,
    val width: Int
) : Figure(color) {
    override fun calculateArea(): Double {
        return (length * width).toDouble()
    }

    override fun calculatePerimeter(): Double {
        return (length * 2 + width * 2).toDouble()
    }
}

fun main() {
    val circle1 = Circle("Черный", 10)
    val circle2 = Circle("Белый", 10)
    val circle3 = Circle("Белый", 10)
    val circle4 = Circle("Черный", 10)
    val rectangle1 = Rectangle("Белый", 12, 4)
    val rectangle2 = Rectangle("Белый", 8, 9)
    val rectangle3 = Rectangle("Черный", 2, 45)
    val rectangle4 = Rectangle("Белый", 132, 1)
    var sumPerimeter = 0.0
    var sumArea = 0.0
    val figures = listOf(circle1, circle2, circle3, circle4, rectangle1, rectangle2, rectangle3, rectangle4)

    figures.forEach {
        if (it.color == "Черный") {
            sumPerimeter += it.calculatePerimeter()
        } else {
            sumArea += it.calculateArea()
        }
    }
    println("Сумма периметров черных фигур: $sumPerimeter, сумма площадей белых фигур: $sumArea")
}
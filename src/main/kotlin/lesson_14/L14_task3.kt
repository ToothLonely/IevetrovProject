package org.example.lesson_14

const val BLACK_COLOR = "Черный"
const val WHITE_COLOR = "Белый"

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

    val circle1 = Circle(BLACK_COLOR, 10)
    val circle2 = Circle(WHITE_COLOR, 10)
    val circle3 = Circle(WHITE_COLOR, 10)
    val circle4 = Circle(BLACK_COLOR, 10)
    val rectangle1 = Rectangle(WHITE_COLOR, 12, 4)
    val rectangle2 = Rectangle(WHITE_COLOR, 8, 9)
    val rectangle3 = Rectangle(BLACK_COLOR, 2, 45)
    val rectangle4 = Rectangle(WHITE_COLOR, 132, 1)
    val figures = listOf(circle1, circle2, circle3, circle4, rectangle1, rectangle2, rectangle3, rectangle4)

    val blackFigures = figures.filter { it.color == BLACK_COLOR }
    val whiteFigures = figures.filter { it.color == WHITE_COLOR }
    val sumPerimeter = blackFigures.sumOf { it.calculatePerimeter() }
    val sumArea = whiteFigures.sumOf { it.calculateArea() }

    println("Сумма периметров черных фигур: $sumPerimeter, сумма площадей белых фигур: $sumArea")
}
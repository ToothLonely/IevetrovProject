package org.example.lesson_18

import kotlin.math.pow
import kotlin.math.sqrt

class Coordinate(val x: Double, val y: Double) {
    constructor(x: Int, y: Int) : this(x.toDouble(), y.toDouble())
}

class Screen {
    fun draw(spot: Coordinate) = "Нарисована точка с координатами: (${spot.x};${spot.y})"

    fun draw(corner1: Coordinate, corner2: Coordinate, corner3: Coordinate, corner4: Coordinate) =
        """Нарисован четырехугольник с вершинами в точках 
            |A: (${corner1.x};${corner1.y}),
            |B: (${corner2.x};${corner2.y}),
            |C: (${corner3.x};${corner3.y}),
            |D: (${corner4.x};${corner4.y})""".trimMargin()

    fun draw(center: Coordinate, edge: Coordinate): String {
        val radius =
            sqrt(((edge.x - center.x).pow(2) + (edge.y - center.y).pow(2))) // Вычисление длины радиуса по двум точкам
        return "Нарисован круг с центром в точке O(${center.x};${center.y}) и радиусом длиной $radius"
    }
}

fun main() {
    val screen = Screen()
    println(screen.draw(Coordinate(1, 8)))
    println(screen.draw(Coordinate(3, 5), Coordinate(4, 5), Coordinate(7.4, 4.3), Coordinate(8.5, 1.3)))
    println(screen.draw(Coordinate(0, 0), Coordinate(4.0, 4.48)))
}
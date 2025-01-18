package org.example.lesson_4

const val MAXIMUM_WEIGHT = 100
const val MINIMUM_WEIGHT = 35
const val MINIMUM_SIZE = 100

fun main() {
    var weight: Byte = 42
    var size: Byte = 120
    println(
        "Груз весом ${weight} кг и объемом ${size} л соотвествует категории 'Average': " +
                "${(weight > MINIMUM_WEIGHT && weight <= MAXIMUM_WEIGHT) && (size < MINIMUM_SIZE)}"
    )

    weight = 20
    size = 80
    println(
        "Груз весом ${weight} кг и объемом ${size} л соотвествует категории 'Average': " +
                "${(weight > MINIMUM_WEIGHT && weight <= MAXIMUM_WEIGHT) && (size < MINIMUM_SIZE)}"
    )

    weight = 50
    size = 100
    println(
        "Груз весом ${weight} кг и объемом ${size} л соотвествует категории 'Average': " +
                "${(weight > MINIMUM_WEIGHT && weight <= MAXIMUM_WEIGHT) && (size < MINIMUM_SIZE)}"
    )
}
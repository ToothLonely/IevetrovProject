package org.example.lesson_4

fun main() {
    var weight: Byte = 42
    var size: Byte = 120
    println(
        "Груз весом ${weight} кг и объемом ${size} л соотвествует категории 'Average': " +
                "${(weight > 35 && weight <= 100) && (size < 100)}"
    )

    weight = 20
    size = 80
    println(
        "Груз весом ${weight} кг и объемом ${size} л соотвествует категории 'Average': " +
                "${(weight > 35 && weight <= 100) && (size < 100)}"
    )

    weight = 50
    size = 100
    println(
        "Груз весом ${weight} кг и объемом ${size} л соотвествует категории 'Average': " +
                "${(weight > 35 && weight <= 100) && (size < 100)}"
    )
}
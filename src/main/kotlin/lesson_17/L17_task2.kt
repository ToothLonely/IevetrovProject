package org.example.lesson_17

class Ship {
    var name: String = "Победа"
        set(value) {
            println("Имя нельзя поменять!")
        }
    var port: String = "Новороссийск"
    var avgSpeed: Double = 99.9

}

fun main() {
    val ship = Ship().apply {
        name = "Беда"
        port = "Архангельск"
        avgSpeed = 199.9
    }.run {
        println("Название корабля: $name")
        println("Порт приписки: $port")
        println("Средняя скорость: $avgSpeed")
    }
}
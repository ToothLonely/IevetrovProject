package org.example.lesson_17

class Ship(
    _name: String,
    _port: String,
    _avgSpeed: Double
) {
    var name: String = _name
        set(value) {
            println("Имя нельзя поменять!")
        }
    var port: String = _port
    var avgSpeed: Double = _avgSpeed

    fun printInfo() {
        println("Название корабля: $name\nПорт приписки: $port\nСредняя скорость: $avgSpeed")
    }

}

fun main() {
    val ship = Ship("Победа", "Новороссийск", 99.9)

    ship.name = "Беда"
    ship.port = "Архангельск"
    ship.avgSpeed = 199.9

    ship.printInfo()
}
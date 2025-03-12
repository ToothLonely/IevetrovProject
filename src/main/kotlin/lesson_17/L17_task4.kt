package org.example.lesson_17

class Package(
    _packageNumber: Int,
    _startLocation: String
) {
    private var movesCounter: Int = 0
    val packageNumber = _packageNumber
    var location = _startLocation
        set(newLocation) {
            field = newLocation
            movesCounter++
        }

    fun showInfo() {
        println("Посылка под номером $packageNumber сейчас находится в $location, количество перемещений: $movesCounter")
    }
}

fun main() {
    val package1 = Package(1, "Moscow")

    package1.location = "Warsaw"
    package1.location = "Madrid"

    package1.showInfo()
}
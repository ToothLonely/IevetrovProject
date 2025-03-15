package org.example.lesson_19

enum class Cartridge(val power: Int, val color: String) {
    BLUE(5, "синий"),
    GREEN(10, "зеленый"),
    RED(20, "красный");

}

fun getPower(color: String): Int {
    for (i in Cartridge.entries) {
        if (color == i.color) return i.power
    }
    return 0
}

class Tank {
    private var cartridgeColor: String = ""

    fun loadCartridge(cartridge: Cartridge) {
        cartridgeColor = cartridge.color
        println("Заряжена новая обойма. Цвет $cartridgeColor")
    }

    fun shoot() {
        val power: Int = getPower(cartridgeColor)
        println("Произведен выстрел. Нанесенный урон: $power")
    }
}

fun main() {
    val tank = Tank()

    tank.loadCartridge(Cartridge.RED)
    tank.shoot()

    tank.loadCartridge(Cartridge.BLUE)
    tank.shoot()

    tank.loadCartridge(Cartridge.GREEN)
    tank.shoot()
}
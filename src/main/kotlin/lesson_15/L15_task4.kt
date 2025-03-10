package org.example.lesson_15

interface Searchable {
    fun searchComponent(component: Component)
}

abstract class Product(
    val name: String,
    val price: Double,
    val amount: Int
)

class Component(name: String, price: Double, amount: Int) : Product(name, price, amount)

class MusicalInstrument(
    name: String,
    price: Double,
    amount: Int
) : Product(name, price, amount), Searchable {
    val listOfComponents: MutableList<Component> = mutableListOf()

    fun addComponent(component: Component): MutableList<Component> {
        listOfComponents.add(component)

        return listOfComponents
    }

    override fun searchComponent(component: Component) {
        print("Выполняется поиск: ")
        val isFound = component.takeIf { it in listOfComponents }?.let {
            "найден"
        } ?: "не найден"
        println("Компонент ${component.name} $isFound")

    }
}

fun main() {
    val drum = MusicalInstrument("барабан", 15_000.99, 10)
    val comp1 = Component("барабанные палочки", 50.99, 11)
    val comp2 = Component("мембрана для барабана", 8_000.99, 3)
    val comp3 = Component("корпус барабана", 4_000.99, 7)
    val comp4 = Component("струны", 1000.0, 55)

    drum.addComponent(comp1)
    drum.addComponent(comp2)
    drum.addComponent(comp3)

    drum.searchComponent(comp1)
    drum.searchComponent(comp4)

}
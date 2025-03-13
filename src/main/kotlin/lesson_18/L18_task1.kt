package org.example.lesson_18

class Order(
    val orderNumber: Int,
) {
    fun printProducts(product: String) {
        println("Заказан товар: $product")
    }

    fun printProducts(listOfProducts: List<String>) {
        print("Заказаны следующие товары: ${listOfProducts.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.printProducts("Монитор")
    order2.printProducts(listOf("Клавиатура", "Мышь", "Блок питания"))
}
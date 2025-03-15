package org.example.lesson_19

enum class Category(protected val nameOfCategory: String) {
    CLOTHES("одежда") {
        override fun getName() = nameOfCategory
    },
    STATIONERY("канцтовары") {
        override fun getName(): String = nameOfCategory
    },
    OTHER("разное") {
        override fun getName(): String = nameOfCategory
    };

    abstract fun getName(): String
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category
) {
    fun printInfo() {
        println("ID товара: $id\nНазвание товара: $name\nКатегория: ${category.getName()}")
    }
}

fun main() {
    val pants = Product("штаны", 1, Category.CLOTHES)
    val pen = Product("ручка", 2, Category.STATIONERY)
    val laptop = Product("ноутбук", 3, Category.OTHER)

    pants.printInfo()
    println()
    pen.printInfo()
    println()
    laptop.printInfo()
}
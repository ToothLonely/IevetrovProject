package org.example.lesson_18

abstract class Creature(
    private val name: String,
    private val meal: String
) {
    fun eat() {
        println("$name -> кушает $meal")
    }

    fun sleep() {
        println("$name -> ложится спать")
    }
}

class Fox : Creature("Лиса", "ягоды")
class Dog : Creature("Собака", "кости")
class Cat : Creature("Кошка", "рыбу")

fun main() {
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()
    val creatures: List<Creature> = listOf(fox, dog, cat)

    for (creature in creatures) creature.eat()
}
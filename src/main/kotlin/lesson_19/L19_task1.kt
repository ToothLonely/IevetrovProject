package org.example.lesson_19

enum class Fish(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun main() {
    println("Виды рыб, доступные для добавления: ")
    for (i in Fish.entries) print("${i.fishName}, ")
}
package org.example.lesson_16

class Character(
    val name: String = "Стрелок",
    var health: Int = 100,
    var damage: Int = 10
) {
    var isDead: Boolean = false

    fun takeDamage(damage: Int) = apply {
        this.health -= damage
        if (health <= 0) killPlayer()
        println("$name получил урон $damage hp. Текущее здоровье: $health")
    }

    fun takeHeal(heal: Int) = apply {
        if (!isDead) {
            this.health += heal
            println("$name исцелился на $heal hp. Текущее здоровье: $health")
        } else {
            println("$name погиб, вылечить невозможно")
        }
    }

    private fun killPlayer() {
        isDead = true
        health = 0
        damage = 0
    }
}

fun main() {
    val a = Character()

    a.takeDamage(67)
    a.takeHeal(15)
    a.takeDamage(24)
    a.takeHeal(16)
    a.takeDamage(65)
    a.takeHeal(100)
}
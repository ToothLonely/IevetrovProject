package org.example.lesson_19

enum class Sex(val nameOfSex: String?) {
    MAN("М"),
    WOMAN("Ж")
}

data class Human(
    val name: String,
    val sex: Sex?
)

class CardIndex {
    private val listOfPeople = mutableListOf<Human>()

    fun addPeople(human: Human): List<Human> {
        listOfPeople.add(human)
        return listOfPeople
    }

    fun printListOfHumans() {
        println(listOfPeople.map { "${it.name} (${it.sex?.nameOfSex})" }.joinToString(", "))
    }
}

fun main() {
    val cardIndex = CardIndex()
    var counter = 5
    var name: String
    var sex: Sex?

    while (counter != 0) {

        println("Введите имя и пол(М или Ж) человека: ")
        name = readln()
        sex = when (readln()) {
            Sex.WOMAN.nameOfSex -> Sex.WOMAN
            Sex.MAN.nameOfSex -> Sex.MAN
            else -> null
        }

        if (sex?.nameOfSex == null) {
            println("Ошибка. Попробуйте снова")
            continue
        } else {
            cardIndex.addPeople(Human(name, sex))
        }

        println("Осталось ввести еще ${--counter}")
    }

    cardIndex.printListOfHumans()
}
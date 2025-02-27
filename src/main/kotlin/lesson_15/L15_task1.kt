package org.example.lesson_15

abstract class Creature(
    val name: String
)

class AerialCreature(name: String) : Creature(name), FlyingMovements {
    override fun rise() {
        print("$name ")
        super.rise()
    }

    override fun landing() {
        print("$name ")
        super.landing()
    }
}

class AquaticCreature(name: String) : Creature(name), SwimmingMovements {
    override fun startSwim() {
        println("$name Начинает вилять хвостом, начиная движение в воде")
    }

    override fun stopSwim() {
        println("$name Заканчивает вилять хвостом, заканчивая движение в воде")
    }

}

class AnywhereCreature(name: String) : Creature(name), FlyingMovements, WalkingMovements, SwimmingMovements {
    override fun startSwim() {
        println("$name начинает движение по поверхности воды")
    }

    override fun stopSwim() {
        println("$name прекращает движение на поверхности воды")
    }

    override fun rise() {
        print("$name ")
        super.rise()
    }

    override fun landing() {
        print("$name ")
        super.landing()
    }

    override fun startWalk() {
        print("$name ")
        super.startWalk()
    }

    override fun stopWalk() {
        print("$name ")
        super.stopWalk()
    }
}

interface FlyingMovements {
    fun rise() {
        println("начинает взмахивать крыльями, стартуя от земли")
    }

    fun landing() {
        println("прекращает махать крыльями и приземляется")
    }
}

interface WalkingMovements {
    fun startWalk() {
        println("начинает перебирать ногами. Делает первый шаг")
    }

    fun stopWalk() {
        println("заканчивает движение. Делает последний шаг")
    }
}

interface SwimmingMovements {
    fun startSwim()

    fun stopSwim()
}

fun main() {
    val duck = AnywhereCreature("Утка")
    val crucianCarp = AquaticCreature("Карась")
    val seagull = AerialCreature("Чайка")

    seagull.rise()
    seagull.landing()

    crucianCarp.startSwim()
    crucianCarp.stopSwim()

    duck.startSwim()
    duck.stopSwim()
    duck.rise()
    duck.landing()
    duck.startWalk()
    duck.stopWalk()
}
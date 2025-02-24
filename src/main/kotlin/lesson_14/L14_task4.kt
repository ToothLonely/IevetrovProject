package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean,
    val isGoodForLanding: Boolean
)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isGoodForLanding: Boolean,
    val listOfSatellites: MutableList<Satellite> = mutableListOf()
) : CelestialBody(name, isAtmosphere, isGoodForLanding) {
    fun addSatellite(satellite: Satellite) {
        listOfSatellites.add(satellite)
    }

    fun printInfo() {
        println("Планета: $name ")
        print("Спутники: ")
        listOfSatellites.forEach { print("${it.name} ") }
    }
}

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isGoodForLanding: Boolean
) : CelestialBody(name, isAtmosphere, isGoodForLanding)

fun main() {
    val ganymede = Satellite("Ганимед", true, false)
    val callisto = Satellite("Каллисто", false, true)
    val jupiter = Planet("Юпитер", false, false)

    jupiter.addSatellite(ganymede)
    jupiter.addSatellite(callisto)
    jupiter.printInfo()
}
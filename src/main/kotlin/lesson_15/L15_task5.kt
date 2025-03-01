package org.example.lesson_15

const val MAXIMUM_NUMBER_OF_PASSENGERS_IN_PASSENGER_TRANSPORT = 3
const val MAXIMUM_WEIGHT_OF_CARGO_IN_PASSENGER_TRANSPORT = 0
const val MAXIMUM_NUMBER_OF_PASSENGERS_IN_CARGO_TRANSPORT = 1
const val MAXIMUM_WEIGHT_OF_CARGO_IN_CARGO_TRANSPORT = 2

interface Loadable {
    fun loadCargo(weightOfCargo: Double)

    fun loadPassengers(numberOfPassengers: Int)
}

interface Unloadable {
    fun unloadCargo()

    fun unloadPassengers()
}

interface Movable {
    fun startMoving(): String {
        return "Включение двигателя. Начало движения"
    }

    fun stopMoving(): String {
        return "Остановка. Выключение двигателя"
    }
}

abstract class Vehicle(val name: String) : Loadable, Unloadable, Movable {
    var passengerFlag = false
    var cargoFlag = false //Создал флаги, чтобы при выгрузке выводить информацию об отсутствии пассажиров или груза,
                        // в случае если их число превышало максимально допустимое
}

class PassengerVehicle(name: String) : Vehicle(name) {

    override fun loadCargo(weightOfCargo: Double) {
        if (weightOfCargo > MAXIMUM_WEIGHT_OF_CARGO_IN_PASSENGER_TRANSPORT) {
            println("Вес груза для $name превышает максимально допустимый")
        } else {
            println("Погрузка в $name произошла успешно")
            cargoFlag = true
        }
    }

    override fun loadPassengers(numberOfPassengers: Int) {
        if (numberOfPassengers > MAXIMUM_NUMBER_OF_PASSENGERS_IN_PASSENGER_TRANSPORT) {
            println("Количество пассажиров для $name превышает максимально допустимое")
        } else {
            println("Все пассажиры успешно сели в $name")
            passengerFlag = true
        }
    }

    override fun unloadCargo() {
        if (cargoFlag) {
            println("Выгрузка $name произошла успешно")
        } else {
            println("В автомобиле $name груза не было ")
        }
    }

    override fun unloadPassengers() {
        if (passengerFlag) {
            println("Все пассажиры успешно вышли из автомобиля $name")
        } else {
            println("В автомобиле $name пассажиров не было")
        }
    }

    override fun startMoving(): String {
        println("$name: ${super.startMoving()}")
        return super.startMoving()
    }

    override fun stopMoving(): String {
        println("$name: ${super.stopMoving()}")
        return super.stopMoving()
    }
}

class CargoVehicle(name: String) : Vehicle(name) {

    override fun loadCargo(weightOfCargo: Double) {
        if (weightOfCargo > MAXIMUM_WEIGHT_OF_CARGO_IN_CARGO_TRANSPORT) {
            println("Вес груза для $name превышает максимально допустимый")
        } else {
            println("Погрузка в $name произошла успешно")
            cargoFlag = true
        }
    }

    override fun loadPassengers(numberOfPassengers: Int) {
        if (numberOfPassengers > MAXIMUM_NUMBER_OF_PASSENGERS_IN_CARGO_TRANSPORT) {
            println("Количество пассажиров в $name превышает максимально допустимое")
        } else {
            println("Все пассажиры успешно сели в $name")
            passengerFlag = true
        }
    }

    override fun unloadCargo() {
        if (cargoFlag) {
            println("Выгрузка из $name произошла успешно")
        } else {
            println("Товара в машине $name не было")
        }
    }

    override fun unloadPassengers() {
        if (passengerFlag) {
            println("Все пассажиры успешно вышли из $name")
        } else {
            println("Пассажиров в $name не было")
        }
    }

    override fun startMoving(): String {
        println("$name: ${super.startMoving()}")
        return super.startMoving()
    }

    override fun stopMoving(): String {
        println("$name: ${super.stopMoving()}")
        return super.stopMoving()
    }
}

fun main() {
    val passengerVehicle1 = PassengerVehicle("passengerVehicle1")
    val passengerVehicle2 = PassengerVehicle("passengerVehicle2")
    val cargoVehicle1 = CargoVehicle("cargoVehicle1")

    passengerVehicle1.loadPassengers(3)
    passengerVehicle1.loadCargo(0.5)
    passengerVehicle2.loadPassengers(3)
    passengerVehicle2.loadCargo(0.0)
    cargoVehicle1.loadPassengers(0)
    cargoVehicle1.loadCargo(2.0)

    passengerVehicle1.startMoving()
    passengerVehicle2.startMoving()
    cargoVehicle1.startMoving()

    passengerVehicle1.stopMoving()
    passengerVehicle2.stopMoving()
    cargoVehicle1.stopMoving()

    passengerVehicle1.unloadPassengers()
    passengerVehicle1.unloadCargo()
    passengerVehicle2.unloadPassengers()
    passengerVehicle2.unloadCargo()
    cargoVehicle1.unloadPassengers()
    cargoVehicle1.unloadCargo()

}
fun rollTheDice(): Int {
    return (1..6).random()
}

fun determineTheWinner(humanMove: Int, robotMove: Int): String {
    if (humanMove > robotMove) {
        println("Победило человечество")
        return "Human"
    } else if (robotMove > humanMove) {
        println("Победила машина")
        return "Robot"
    } else {
        println("Победила дружба")
        return "Draw"
    }
}

fun move(player: String, moveResult: Int) {
    print("$player делает ход: ")
    Thread.sleep(2000)
    println(moveResult)
    Thread.sleep(1000)
}

fun playRound(humanMove: Int, humanName: String, robotMove: Int, robotName: String): String {
    move(humanName, humanMove)
    move(robotName, robotMove)
    return determineTheWinner(humanMove, robotMove)
}

fun main() {
    val humanName = "Человек"
    val robotName = "Машина"
    var humanMove: Int
    var robotMove: Int
    var humanWinsCounter: Int = 0
    var robotWinsCounter: Int = 0
    var drawCounter: Int = 0
    var moveCounter: Int = 0

    do {
        println("Раунд ${++moveCounter}")
        humanMove = rollTheDice()
        robotMove = rollTheDice()
        when (playRound(humanMove, humanName, robotMove, robotName)) {
            "Human" -> humanWinsCounter++
            "Robot" -> robotWinsCounter++
            "Draw" -> drawCounter++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().equals("Да", ignoreCase = true))

    println(
        """
        |Раундов сыграно: $moveCounter
        |Вы победили машину $humanWinsCounter раз
        |Машина победила вас $robotWinsCounter раз
        |Вничью сыграно $drawCounter игр
    """.trimMargin()
    )
}
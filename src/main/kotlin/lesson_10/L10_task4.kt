fun rollTheDice(): Int {
    return (1..6).random()
}

fun playRound(humanMove: Int, robotMove: Int): String {
    print("Ход человека: ")
    Thread.sleep(2000)
    println(humanMove)
    Thread.sleep(1000)

    print("Ход машины: ")
    Thread.sleep(2000)
    println(robotMove)
    Thread.sleep(1000)

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

fun main() {
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
        when (playRound(humanMove, robotMove)) {
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
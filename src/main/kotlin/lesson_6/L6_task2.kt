const val MILLIS_IN_SECOND: Short = 1000

fun main() {
    print("На сколько секунд засечь таймер? ")
    val seconds: Int = readln().toInt()
    Thread.sleep(seconds.toLong() * MILLIS_IN_SECOND)
    println("Прошло $seconds секунд(-ы)")
}
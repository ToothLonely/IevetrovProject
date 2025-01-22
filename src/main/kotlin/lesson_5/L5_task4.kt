fun main() {
    val myName = "Zaphod"
    val myPassword = "PanGalactic"

    print("Введите имя пользователя: ")
    val inputName: String = readln()
    val inputPassword: String

    if (inputName == myName) {
        print("Введите пароль: ")
        inputPassword = readln()
        if (inputPassword == myPassword) {
            println("Welcome, $myName!")
        } else {
            println("Wrong password!")
        }
    } else {
        println("Wrong name. Please sign in")
    }
}
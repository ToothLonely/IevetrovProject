package org.example.lesson_7

fun main() {
    var passwordLength: Int
    print("Введите длину пароля (Минимум 6): ")
    passwordLength = readln().toInt()

    //Проверяю, чтобы длина пароля была не менее 6 символов
    while (passwordLength < 6) {
        print("Неверный ввод, попробуйте еще раз: ")
        passwordLength = readln().toInt()
    }

    //Создаю алфавит символов, которые будут использоваться для пароля
    val lowercaseLetters: CharRange = ('a'..'z')
    val uppercaseLetters: CharRange = ('A'..'Z')
    val digits: CharRange = ('0'..'9')
    val passwordAlphabet: List<Char> = lowercaseLetters + uppercaseLetters + digits

    //Создаю флаги наличия каждого вида символа в пароле
    var isDigitInPassword: Boolean = false
    var isLowercaseLetterInPassword: Boolean = false
    var isUppercaseLetterInPassword: Boolean = false

    var password: String = ""
    var newSymbolToPassword: Char //В этой переменной будет храниться значение нового сгенерированного символа
    var passwordIterator: Int = 0

    //Не получается реализовать через for,
    //т.к неизвестно когда программа сгенерирует правильную комбинацию символов
    while (passwordIterator < passwordLength) {

        newSymbolToPassword = passwordAlphabet.random()
        password += newSymbolToPassword

        //Проверяю наличие каждого типа символа в пароле
        if (newSymbolToPassword in digits && !isDigitInPassword) {
            isDigitInPassword = true
            continue
        }
        if (newSymbolToPassword in uppercaseLetters && !isUppercaseLetterInPassword) {
            isUppercaseLetterInPassword = true
            continue
        }
        if (newSymbolToPassword in lowercaseLetters && !isLowercaseLetterInPassword) {
            isLowercaseLetterInPassword = true
            continue
        }
        passwordIterator++

        //Когда дохожу до последнего символа, то проверяю наличие всех трех видов в пароле,
        //если нет хотя бы одного, то обнуляю значения пароля и итератора и начинаю генерировать сначала
        if ((!isDigitInPassword || !isUppercaseLetterInPassword || !isLowercaseLetterInPassword)
            && passwordIterator == passwordLength
        ) {
            passwordIterator = 0
            password = ""
        }
    }
    println("Ваш пароль: $password")
}
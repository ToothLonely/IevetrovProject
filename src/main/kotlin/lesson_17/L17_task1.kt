package org.example.lesson_17

class Quiz(
    _question: String,
    _answer: String
) {
    val question = _question
        get() = field

    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}
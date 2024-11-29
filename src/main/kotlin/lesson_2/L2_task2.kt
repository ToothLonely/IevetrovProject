package org.example.lesson_2

fun main() {
    //Объявление и инициализация переменных
    val numberOfEmployees: Byte = 50
    val numberOfInterns: Byte = 30
    val internSalary: Short = 20_000
    val employeeSalary: Short = 30_000

    //Вычисление значений
    val expensesOnEmployees: Int = employeeSalary * numberOfEmployees
    val expensesOnInterns: Int = internSalary * numberOfInterns
    val allExpenses: Int = expensesOnInterns + expensesOnEmployees
    val allWorkers: Byte = (numberOfEmployees + numberOfInterns).toByte()
    val expensePerWorker: Int = allExpenses / allWorkers

    println("Расход на всех постоянных сотрудников: $expensesOnEmployees")
    println("Общие расходы: $allExpenses")
    println("Расход на одного сотрудника: $expensePerWorker")
}
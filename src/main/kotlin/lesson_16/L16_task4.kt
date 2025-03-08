package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    private var status: Boolean = false
) {
    private fun setStatus(newStatus: Boolean) {
        status = newStatus
        println("Текущий статус: $status")
    }

    fun sendRequestToManager(newStatus: Boolean) {
        println("Отправляем заявку менеджеру для изменения статуса...")
        setStatus(newStatus)
    }
}

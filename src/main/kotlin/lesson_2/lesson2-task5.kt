package lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val years = 20
    val totalAmount = depositAmount * (1 + (interestRate / 100)).pow(years)
    println(String.format("Итоговая сумма вклада %.3f", totalAmount))
}
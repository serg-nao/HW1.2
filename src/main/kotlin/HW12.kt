package ru.netology

fun main() {
    val amount = 1_000_00
    val tax = 0.0075
    val minTax = 35_00

    val totalTax = if (amount * tax > minTax) amount * tax else minTax

    println("Tax of amount $amount is: $totalTax")
}
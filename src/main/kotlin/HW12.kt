package ru.netology

fun main() {
    val amount1 = 1_000_00
    val amount2 = 10_000_00
    val tax = 0.0075
    val minTax = 35_00

    val totalTax1 = if (amount1 * tax > minTax) amount1 * tax else minTax
    val totalTax2 = if (amount2 * tax > minTax) amount1 * tax else minTax

    println("Tax of amount $amount1 is: $totalTax1")
    println("Tax of amount $amount2 is: $totalTax2")
}
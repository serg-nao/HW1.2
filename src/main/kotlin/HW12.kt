package ru.netology

fun main() {
    val amount = 1_000_00
    val taxRatio = 0.0075
    val minTax = 35_00

    val standartTax = amount * taxRatio

    val totalTax = if (standartTax > minTax) standartTax else minTax

    println("Tax of amount $amount is: $totalTax")
}
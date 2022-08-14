package com.example.jettipapp.utill

fun calculateTotalTip(
    totalBil: Double,
    tipPercantage: Int
): Double {
    return if (totalBil > 1 &&
        totalBil.toString().isNotEmpty()
    )
        (totalBil * tipPercantage) / 100 else 0.0
}

fun calculateTotalPerson(
    totalBil: Double,
    splitBy: Int,
    tipPercantage: Int
): Double {
    val bill = calculateTotalTip(
        totalBil = totalBil,
        tipPercantage = tipPercantage
    ) + totalBil

    return (bill / splitBy)
}
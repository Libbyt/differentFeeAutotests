fun commissionCalculate(cardType: String, payment: Double, monthlyTotal: Double): Int {
    var commission = 0.0
    when (cardType) {
        "VK Pay" -> commission = 0.0
        "Maestro", "MasterCard" -> commission = if (monthlyTotal > 75000_00) payment * 0.006 + 20 else commission
        "Visa", "Мир" -> commission = if (payment * 0.006 < 3500.0) 3500.0 else payment * 0.06
    }
    return commission.toInt()
}

fun main() {
    println("Ваша комиссия - ${commissionCalculate("Visa", 75.00 * 100, 75.00 * 100)} копеек")
}
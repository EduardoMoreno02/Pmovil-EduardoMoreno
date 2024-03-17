package clases

class International(destination: String, val country: String, val city: String, duration: Int, pricePerDay: Double) : Travel(destination, duration, pricePerDay) {
    override fun getPrice(): Double {
        val totalPrice = pricePerDay * duration
        val taxRate = getTaxRate(country)
        val tax = totalPrice * taxRate
        return totalPrice + tax
    }

    private fun getTaxRate(country: String): Double {
        return when (country) {
            "Alemania" -> 0.16
            "Chile" -> 0.05
            "Canadá" -> 0.10
            else -> 0.0
        }
    }
}
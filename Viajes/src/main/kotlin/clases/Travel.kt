package clases

abstract class Travel(val destination: String, val duration: Int, val pricePerDay: Double) {
    abstract fun getPrice(): Double
}
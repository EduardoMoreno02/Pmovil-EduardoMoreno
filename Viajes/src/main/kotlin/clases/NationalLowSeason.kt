package clases

import interfases.Cancellable

class NationalLowSeason(destination: String, duration: Int, pricePerDay: Double) : Travel(destination, duration, pricePerDay),
    Cancellable {
    override fun getPrice(): Double {
        return pricePerDay * duration
    }

    override fun cancelTrip() {
        println("Viaje nacional en temporada baja cancelado para $destination.")
    }
}
import clases.International
import clases.NationalLowSeason

fun main() {
    // Ejemplo de uso
    val nationalTrip = NationalLowSeason("Montevideo", 7, 500.0)
    println("Precio del viaje nacional: ${nationalTrip.getPrice()}")

    val internationalTrip = International("Londres", "Reino Unido", "Londres", 10, 800.0)
    println("Precio del viaje internacional: ${internationalTrip.getPrice()}")
    // Cancelar viaje nacional
    nationalTrip.cancelTrip()

    // Crear un viaje internacional a Chile
    val chileTrip = International("Valparaíso", "Chile", "Valparaíso", 5, 721.0)

    // Obtener el precio del viaje a Chile
    val totalPriceChile = chileTrip.getPrice()

    // Imprimir el precio del viaje a Chile
    println("Precio del viaje a Chile: $totalPriceChile")
}
package interfaces

fun main() {
    val car = Car("Tesla","Red")
    car.startEngine()
    val truck = Truck("Lamborghini", "Blue")
    truck.startEngine()
    val plane = Plane("Boeing","White")
    plane.startEngine()
}
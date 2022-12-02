package inheritance

fun main() {
    var car = Car("Tesla", "Red",1,4)
    var plane = Plane("Boeing", "White and Blue",4,10)

    car.move()
    car.stop()
    plane.move()
    plane.stop()
}

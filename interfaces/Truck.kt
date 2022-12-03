package interfaces

class Truck(val name: String, val color: String): Engine  {
    override fun startEngine() {
        println("Let's work")
    }
}
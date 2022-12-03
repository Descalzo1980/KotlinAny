package interfaces



class Car(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("Car engine start")
    }
}
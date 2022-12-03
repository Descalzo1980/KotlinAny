package interfaces

class Plane(val name: String, val color: String): Engine   {
    override fun startEngine() {
        println("Plane fly")
    }
}
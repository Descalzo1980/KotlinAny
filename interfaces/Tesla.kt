package interfaces

class Tesla(val name : String,val color: String) : Engine {
    override fun startEngine() {
        println("Tesla start engine")
    }
}
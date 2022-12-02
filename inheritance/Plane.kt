package inheritance

class Plane(name: String, color: String,val engines : Int, val doors : Int) : Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    override fun stop() {

        super.stop()
    }

    fun flying(){
        println("The plane is flying")
    }
}
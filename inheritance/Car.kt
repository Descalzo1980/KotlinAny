package inheritance

class Car(name: String,  color: String, val engines : Int, val doors : Int) : Vehicle(name, color) {

    override fun move() {
        super.move()

    }

    override fun stop() {
        super.stop()
    }
}
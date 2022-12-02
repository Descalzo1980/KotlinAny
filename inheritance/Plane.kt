package inheritance

class Plane(val name : String,val color : String,val engines : Int, val doors : Int) {

    fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}
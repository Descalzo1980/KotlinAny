package inheritance

open class Vehicle(val name : String,val color : String) {


    open fun move(){
        println("$name is moving")
    }

    open fun stop(){
        println("$name has stopped")
    }
}
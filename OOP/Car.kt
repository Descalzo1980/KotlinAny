package OOP

fun main() {
    val car = Car(name = "Tesla", model = "S Praid", color = "Red", doors = 4)

//    println("\n")
//    println("Name = ${car.name}")
//    println("Color = ${car.color}")
//    println("Doors = ${car.doors}")
//    println("Model = ${car.model}")
//
//    car.move()
//    car.stop()
    println( car.repeatStr(3,"ALex"))

//    val car1 = Car(name = "Jeep", model = "Mustang", color = "Green", doors = 8)
//    car1.name = "Ford"
//    car1.model = "Mustang"
//    car1.color = "Blue"
//    car1.doors = 2
//
//    println("\n")
//    println("Name = ${car1.name}")
//    println("Color = ${car1.color}")
//    println("Doors = ${car1.doors}")
//    println("Model = ${car1.model}")
//
//    car1.move()
//    car1.stop()



}

class Car(var name: String, var model: String, var color: String, var doors: Int){


    fun move(){
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stop")
    }
    fun repeatStr(r: Int, str: String) : String{
        return str.repeat(r)
    }

}

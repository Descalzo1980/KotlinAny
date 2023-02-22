package atomic.section2

import java.util.*
import kotlin.math.PI as circleRatio

fun main() {
//    println(circleRatio)
//    val r1 = IntRange(0, 10)
//    val r2 = IntRange(5, 7)
//    println(r1.sum())
//    println(r2)
//    val s = "123"
//    println(s.reversed())
//    println(s.lowercase(Locale.getDefault()))
//    println(s.toInt())
//    val g1 = Giraffe()
//    val g2 = Giraffe()
//    val b = Bear()
//    val h = Hippo()
//    println(g1)
//    println(g2)
//    println(h)
//    println(b)
//    val hamster = Hamster()
//    println(hamster.speak())
//    println(hamster.exercise())
//    val cup2 = Cup2()
//    cup2.add(50)
//    println(cup2.percentFull)
//    cup2.add(100)
//    println(cup2.percentFull)
//    var sofa = Sofa()
//    sofa.cover
//    sofa = Sofa()
//    val kitchen1 = Kitchen()
//    val kitchen2 = kitchen1
//    println("kitchen1: ${kitchen1.table}")
//    println("kitchen2: ${kitchen2.table}")
//    kitchen1.table = "Square table"
//    println("kitchen1: ${kitchen1.table}")
//    println("kitchen2: ${kitchen2.table}")
//    val wombat = Wombat()
//    val alien = Alien("Boo")
//    println(alien.greeting)
//    alien.name()
//    val alien1 = MutableNameAlien("Reverse Giraffe")
//    val alien2 = FixedNameAlien("Krombopolis Michael")
//    alien1.name
//    alien1.name = "Param"
//    val kevin = AlienSpecies("Zigerion",2,2,2)
//    println(kevin.describe())
//    val mortyJr = AlienSpecies("Gazorpian", 2, 6, 2)
//    println(mortyJr.describe())
//    val krombopulosMichael =
//        AlienSpecies("Gromflomite", 2, 2, 2)
//    println(krombopulosMichael)
//    val zeep = Scientist("Zeep Xanflorp")
//    println(zeep)
//    val animal = Animal("Rabbit")
//    recordAnimal(animal)
//    recordAnimals()
//    recordAnimalsCount()
//    val x = Cookie(false)
//    x.bite()
//    x.eat()
//    x.customCookie = "Жопа"
//
//    println(x.cookie)
//    val c = Counter(11) // [1]
//    val ch = CounterHolder(c) // [2]
//    println(ch)
//    c.increment() // [3]
//    println(ch)
//    val ch2 = CounterHolder(Counter(9)) // [4]
//    println(ch2)

}

class Counter(private var start: Int){
    fun increment(){
        start +=1
    }

    override fun toString() : String = start.toString()
}
class CounterHolder(counter : Counter){
    private val ctr = counter
    override fun toString() =
        "CounterHolder: $ctr"
}
class Cookie(private var isReady: Boolean ) { // [1]
    var cookie: String = ""
        get() {
            return field
        }
        set(value) {
            field = "Boo"
            println("Set cookie to $field")
        }

    var customCookie: String = ""
        set(value) {
            cookie = value
            field = value
        }

    private fun crumble() = // [2]
        println("crumble")
    public fun bite() = // [3]
        println("bite")
    fun eat() { // [4]
        isReady = true // [5]
        crumble()
        bite()
    }
}
private var index = 0 // [1]
private class Animal(val name: String) // [2]
private fun recordAnimal(animal: Animal) { // [3]
    println("Animal #$index: ${animal.name}")
    index++
}
fun recordAnimals() {
    recordAnimal(Animal("Tiger"))
    recordAnimal(Animal("Antelope"))
}
fun recordAnimalsCount() {
    println("$index animals are here!")
}
class Scientist(val name: String) {
    override fun toString(): String {
        return "Scientist('$name')"
    }
}

class AlienSpecies(
    val name: String,
    val eyes: Int,
    val hands: Int,
    val legs: Int
) {
    fun describe() =
        "$name with $eyes eyes, " +
                "$hands hands and $legs legs"

    override fun toString() : String {
        return "AlienSpecies(name='$name', eyes=$eyes, hands=$hands, legs=$legs)"
    }
}
class MutableNameAlien(var name: String)
class FixedNameAlien(val name: String)

class Alien(name: String){
    val greeting = "Poor $name"
}
class Wombat
class Kitchen {
    var table: String = "Round table"
}
class Giraffe
class Bear
class Hippo
class Hamster {
    fun speak() = "Squeak! "
    fun exercise() =
        this.speak() + // Qualified with 'this'
                speak() + // Without 'this'
                "Running on wheel"
}
class Cup2 {
    var percentFull = 0
    val max = 100
    fun add(increase: Int): Int {
        percentFull += increase
        if (percentFull > max)
            percentFull = max
        return percentFull
    }
}
class Sofa(){
    val cover: String = "Loveseat cover"
}

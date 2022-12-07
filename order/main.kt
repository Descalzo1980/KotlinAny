package order

import java.util.PrimitiveIterator
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val numbers = mutableListOf(6, 42, 10, 4,100 , 60 ,200)
    val string = listOf("one","two","three","four")
    numbers.sorted().forEach { println(it) }
    println(string.random())
    val randomValues = List(10) {Random.nextInt(0..100)}
    println(randomValues)

    val laptop = mutableListOf(
        Laptop("Dell",2022,4,1000),
        Laptop("Acer",2022,8,2000),
        Laptop("Bapple",2022,16,3000),
        Laptop("Capple",2022,16,4000),
        Laptop("Dapple",2022,16,5000),
        Laptop("Happle",2022,16,6000)
    )

    laptop.sorted().forEach { println(it) }
}

data class Laptop(val brand: String,val year: Int,val ram: Int,val price: Int) : Comparable<Laptop>{
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.price}")
            1
        }else if(this.price < other.price){
            println("In if statement: Swapping ${this.brand} with ${other.price}")
            -1
        }else{
            println("In if statement: Swapping ${this.brand} with ${other.price}")
            0
        }
    }
}
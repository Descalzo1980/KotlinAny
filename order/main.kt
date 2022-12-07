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
        Laptop("Acer",2010,8,2000),
        Laptop("Happle",2012,24,6000),
        Laptop("Capple",2013,20,4000),
        Laptop("Dell",2014,4,1000),
        Laptop("Bapple",2015,18,3000),
        Laptop("Dapple",2016,22,5000),

    )
    println("\n")
    laptop.sorted().forEach { println(it) }
    println("\n")
    laptop.sortedWith(comparator = ComparatorRam()).forEach { println(it.ram) }
    laptop.sortedWith(comparator = ComparatorYear()).forEach { _ -> }
    /*
    * or we can use lambda
    * */
    var sing = "*"

    println(sing.repeat(80))
    laptop.sortedWith(compareBy { it.price }).forEach { println(it) }
    println(sing.repeat(80))
    laptop.sortedWith(compareBy { it.year }).forEach { println(it) }
    println(sing.repeat(80))
    laptop.sortedWith(compareBy { it.brand }).forEach { println(it) }
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

class ComparatorRam : Comparator<Laptop>{
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram){
            1
        }else if (laptop1.ram < laptop2.ram){
            -1
        }else{
            0
        }
    }

}

class ComparatorYear : Comparator<Laptop>{
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.year > laptop2.year){
            println("У этого компа ${laptop1.brand} вот такой ${laptop1.year} год выпуска")
            1
        }else if(laptop1.year < laptop2.year){
            println("У этого компа ${laptop1.brand} вот такой ${laptop1.year} год выпуска")
            0
        }else{
            println("У этого компа ${laptop1.brand} вот такой ${laptop1.year} год выпуска")
            0
        }
    }
}


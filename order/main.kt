package order

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val numbers = mutableListOf(6, 42, 10, 4,100 , 60 ,200)
    val string = listOf("one","two","three","four")
    numbers.sorted().forEach { println(it) }
    println(string.random())
    val randomValues = List(10) {Random.nextInt(0..100)}
    println(randomValues)
}
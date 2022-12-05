package collection_operation

import java.util.*


fun main() {
    val numbers = setOf(1,2,3,4,5)

    println(numbers.map {if(it == 3) it * 100 else it * 10})
    println(numbers.mapIndexedNotNull { index, value -> if(index == 0) null else index*value})

    val employers = mapOf<Int,String>(1 to "Alex",2 to "Boo",3 to "Bob")

    val result = employers.mapValues { it.key + it.value.length }
    for (i in result.values){
        println("Name : $i")
    }
    println("Now key = ${result.keys} and names = ${result.values}")

    /*zipping
    * */

    val colors = listOf("red","brown","grey")
    val animals = listOf("fox","bear","wolf")
    val res = (colors zip animals)
    val res1 = (colors.zip(animals){color,animal-> "The $animal are $color"})
    println(res1)

}
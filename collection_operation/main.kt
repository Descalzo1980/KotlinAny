package collection_operation

import java.beans.Expression
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
    val res1 = (colors.zip(animals){color,animal-> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})
    println(res1)

    val str1 = "ABCCCVVBBGG"
    val str2 = "VBB".toSet()
    fun filterString(expression: String) = expression.filter { it in str2}
    val filtered = filterString(str1)
    println(filtered)
    val res2 = str1.filter { it -> it.isDigit() }
    println("Filtered String : $res2")

    val numbersPairs = listOf("one" to 1,"two" to 2,"three" to 3)
    println(numbersPairs)
    println(numbersPairs.unzip())
}

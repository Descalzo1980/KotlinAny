package arrays

import kotlin.reflect.typeOf

fun main() {

    val names = arrayOf("one", "two", "three", "four")

    val numbers = arrayOf(1,3,4,5,5,"String","Alex","Boo",'a')
    names[0] = "five"
/*    println("First element : ${names[0]}")
    println("First element : ${names.size-1}")*/

    for (i in numbers){
        if (i is Int){
            println("Это числа $i")
        }else if (i is String){
            println("Это строки $i")
        }

    }
}

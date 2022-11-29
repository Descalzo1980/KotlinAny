package oop

import java.util.*


fun removeChar(str: String): String = str.substring(1,str.lastIndex)

fun litres(time: Double): Int {
    return (time / 2).toInt()
}

object GrassHopper {
    var sum = 0
    fun summation(n:Int):Int {
        for (i in 0..n) {
            sum += i
        }
        return sum
    }
}

fun abbrevName(name:String){
    val str1 = "Sam"
    var str2 = "Harris"
    val index = 1
    val ch = "${str1.get(1)}"
    val ch1 = "${str2.get(1)}"
    println(ch.uppercase() + ch1.uppercase())
}

fun main() {
    val result = removeChar("Hello").apply {
        println(message = this)
    }

    val res = litres(3.0)
    println(res)

    val res1 = GrassHopper.summation(8)
    println(res1)

    var res2 = abbrevName("Stas Leonov")
}
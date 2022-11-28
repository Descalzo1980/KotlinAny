package oop



fun removeChar(str: String): String = str.substring(1,str.lastIndex)

fun litres(time: Double): Int {
    return (time / 2).toInt()
}

fun main() {
    val result = removeChar("Hello").apply {
        println(message = this)
    }

    val res = litres(3.0)
    println(res)
}
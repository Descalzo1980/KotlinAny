package plusandminus

fun main() {
    val numbers = mutableListOf("one","two","three","four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three","four").toSet()
    println(plusList)
    println(minusList)
}
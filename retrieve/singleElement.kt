package retrieve

fun main() {
    val strings = listOf("one", "two", "three", "four", "five", "six")
    val numbers = listOf(1,2,3,4,5,6)
    println(numbers.elementAtOrElse(3){990})
    println(numbers.first())
    println(numbers.last())
    println("\n")
    println(strings.first {it.length > 4})
    println(strings.first {it.startsWith("f") })
    println(numbers.random())
    println(strings.random())
}
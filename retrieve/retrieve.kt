package retrieve

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3, 5, 0)))
    println("\n")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(5))
    println("\n")
    println(numbers.takeWhile { !it.startsWith("f") })
    println(numbers.takeLastWhile { it != "three" })
    println(numbers.dropWhile { it.length < 4 })
    println(numbers.dropLastWhile { it.contains("i") })

    val numbersString = ('a'..'z').toList()
    println(numbersString.chunked(3))

}
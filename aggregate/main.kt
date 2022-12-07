package aggregate

fun main() {
    val numbers = listOf(6, 42, 10, 4)

    println("Count: ${numbers.count()}")
    println("Max: ${numbers.maxOrNull()}")
    println("Min: ${numbers.minOrNull()}")
    println("Average: ${numbers.average()}")
    println("Sum: ${numbers.sum()}")
    println("SumDouble : ${numbers.sumOf { it * 2 }}")

    val simpleSum = numbers.reduce { acc, i -> acc + i }
    println(simpleSum)
    val simpleSum1 = numbers.fold(2) { acc, i -> acc + i }
    println(simpleSum1)
}
package collection_operation


fun main() {
    val numberString = listOf("one", "two","three","four")
    println(numberString)
    println(numberString.joinToString())
    val listString = StringBuilder("The list of number: ")
    println(numberString.joinTo(listString))

    println(numberString.joinToString(separator = " | ", prefix = "Start: ", postfix = ": end"))

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 25, truncated = "<...>"))
    println(numberString.joinToString { "Element: ${it.uppercase()}" })
}


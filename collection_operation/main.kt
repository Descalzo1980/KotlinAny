package collection_operation


fun main() {

    val numbers = listOf("one","two","three","four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy(keySelector = {it.first().uppercase()}))
}

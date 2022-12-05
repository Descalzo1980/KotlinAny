package collection_operation


fun main() {

    val numbers = listOf("one","two","three","four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))

    /*
    * flatten*/

    val numberSets = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    println(numberSets[2][2])
}

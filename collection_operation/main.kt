package collection_operation


fun main() {

    /*
     * flatten*/

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    for (numbers in numberSets) {
        for (number in numbers) {
            println(number)
        }
        println("\n")
    }
    val numbersFlatten = numberSets.flatten()
    println(numbersFlatten)
}


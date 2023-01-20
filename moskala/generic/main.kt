package moskala.generic

import kotlin.random.Random

fun main() {
    val letter = ValueWithHistory<String?>(null)
    letter.setValue("A")
    letter.setValue(null)
    val l = letter.currentValue() // the type of l is String?
    println(l) // null
    val h = letter.history() // the type of h is List<String?>
    println(h) // [null, A, null]
    val letters = ArrayList<String?>()
    letters.add("A")
    letters.add(null)
    println(letters) // [A, null]
    val l2 = letters[1] // the type of l2 is String?
    println(l2) // null
}

class ValueWithHistory<T>(
    private var value: T
) {
    private var history: List<T> = listOf(value)
    fun setValue(value: T) {
        this.value = value
        this.history += value
    }
    fun currentValue(): T = value
    fun history(): List<T> = history
}


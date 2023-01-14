package moskala.collections

fun main() {
// We create `List` using `listOf` function.
    val list: List<String> = listOf("A", "B", "C")
    list[2]
    list.indexOf("B")
    list.getOrNull(7)
    list.getOrElse(1){"V"}
    val mutableList1: MutableList<String> = list.toMutableList()
    mutableList1.add("F")
    mutableList1.addAll(listOf("G","R","L"))
    mutableList1.add(2,"U")
    mutableList1.remove("A")
// We create `MutableList` using `mutableListOf` function.
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
// We create `Set` using `setOf` function.
    val set: Set<Double> = setOf(3.14, 7.11)
// We create `MutableSet` using `mutableSetOf` function.
    val mutableSet: MutableSet<Char> = mutableSetOf('A', 'B')
// We create `Map` using `mapOf` function.
    val map: Map<Char, String> =
        mapOf('A' to "Alex", 'B' to "Ben")
// We create `MutableMap` using `mutableMapOf` function.
    val mutableMap: MutableMap<Int, Char> =
        mutableMapOf(1 to 'A', 2 to 'B')
// We create `Array` using `arrayOf` function.
    val array: Array<String> = arrayOf("Dukaj", "Sapkowski")
// We create `IntArray` using `intArrayOf` function.
    val intArray: IntArray = intArrayOf(9, 8, 7)
// We create `ArrayList` using `arrayListOf` function.
    val arrayList: ArrayList<String> = arrayListOf("M", "N")

    val alphabet: Map<Char, Int> =
        mapOf('A' to 1, 'B' to 2, 'C' to 3)
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
}

interface Iterable<out T> {
    operator fun iterator(): Iterator<T>
}

interface Collection<out E> : Iterable<E> {
    val size: Int
    fun isEmpty(): Boolean
    operator fun contains(element: @UnsafeVariance E): Boolean
    override fun iterator(): Iterator<E>
    fun containsAll(elements: Collection<@UnsafeVariance E>): Boolean
}

operator fun <T> Array<T>.plus(element: T): Array<T?> {
    val index = size
    val result = this.copyOf(index + 1)
    result[index] = element
    return result
}

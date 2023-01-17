package moskala.collections


fun main() {
//    val list: List<String> = listOf("A", "B", "C")
//    list[2]
//    list.indexOf("B")
//    list.getOrNull(7)
//    list.getOrElse(1){"V"}
//    val mutableList1: MutableList<String> = list.toMutableList()
//    mutableList1.add("F")
//    mutableList1.addAll(listOf("G","R","L"))
//    mutableList1.add(2,"U")
//    mutableList1.remove("A")
//// We create `MutableList` using `mutableListOf` function.
//    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
//// We create `Set` using `setOf` function.
//    val set: Set<Double> = setOf(3.14, 7.11)
//// We create `MutableSet` using `mutableSetOf` function.
//    val mutableSet: MutableSet<Char> = mutableSetOf('A', 'B')
//// We create `Map` using `mapOf` function.
//    val map: Map<Char, String> =
//        mapOf('A' to "Alex", 'B' to "Ben")
//// We create `MutableMap` using `mutableMapOf` function.
//    val mutableMap: MutableMap<Int, Char> =
//        mutableMapOf(1 to 'A', 2 to 'B')
//// We create `Array` using `arrayOf` function.
//    val array: Array<String> = arrayOf("Dukaj", "Sapkowski")
//// We create `IntArray` using `intArrayOf` function.
//    val intArray: IntArray = intArrayOf(9, 8, 7)
//// We create `ArrayList` using `arrayListOf` function.
//    val arrayList: ArrayList<String> = arrayListOf("M", "N")
//
//    val alphabet: Map<Char, Int> =
//        mapOf('A' to 1, 'B' to 2, 'C' to 3)
//    val number: Int? = alphabet['A']
//    println(number) // 1
//    println(alphabet['B']) // 2
//    println(alphabet['&']) // null
//
//
//
//    val alphabets  = ('A'..'Z').toMutableList().random()
//    println(alphabets)
//
//    val myList = arrayOf("B","C","D")
//
//    setOf("A","B","C")
//
//    println(markdownList("A","B","C","D",* myList))
//
//    val mySet = setOf('A','B','C','A')
//    println(mySet)

//    val myListOf = listOf("AA","AB","CC","DD")
//    myListOf.filter { it.length > 1}
//    println(myListOf)
//
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers)

//    val filteredIdx = numbers.filterIndexed { index, s -> (index != 0) && (s.length < 5)  }
//    val filteredNot = numbers.filterNot { it.length <= 3 }

//    println(filteredIdx)
//    println(filteredNot)
}

//fun <T> listOf(vararg element: T): List<T> {
//    return if(element.isNotEmpty()) element.asList() else emptyList()
//}
//
//fun <T> setOf(vararg elements: T): Set<T> =
//    if (elements.isNotEmpty()) elements.toSet() else emptySet()
//
//
//interface Iterable<out T> {
//    operator fun iterator(): Iterator<T>
//}
//
//interface Collection<out E> : Iterable<E> {
//    val size: Int
//    fun isEmpty(): Boolean
//    operator fun contains(element: @UnsafeVariance E): Boolean
//    override fun iterator(): Iterator<E>
//    fun containsAll(elements: Collection<@UnsafeVariance E>): Boolean
//}
//
//operator fun <T> Array<T>.plus(element: T): Array<T?> {
//    val index = size
//    val result = this.copyOf(index + 1)
//    result[index] = element
//    return result
//}
//
//fun markdownList(vararg lines: String): String{
//    var str = ""
//    for((i,line) in lines.withIndex()){
//        str += " *$line"
//        if(i !=lines.size){
//            str += "\n"
//        }
//    }
//    return str
//}

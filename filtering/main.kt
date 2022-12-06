package filtering

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val longerThanThree = numbers.filter { it.length > 3 }
    println(longerThanThree)

    val numbersMap = mutableMapOf("key 1 " to 1,"key 2 " to 2, "key 3" to 3,"key 101" to 101)
    val filterMap = (numbersMap.filter { it.key.endsWith("1")}).toMutableMap()
    filterMap.remove("key 101")
    println(filterMap)

    val filterIndex = numbers.filterIndexed { index, value ->  (index !=0 && (value.length < 5))}
    val filterNot = numbers.filterNot { it.length <=3 }
    println(filterIndex)
    println(filterNot)

    val mixedList = listOf(1,2,3,4,5,'A',"A",'B',"B","Alex",true,false)
    mixedList.filterIsInstance<Int>().forEach {
        println(it)
    }
    val(match,rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)
    println(numbers.any{it.endsWith("e")})
    println(numbers.none { it.endsWith("w") })
    println(numbers.all { it.length > 1})
}
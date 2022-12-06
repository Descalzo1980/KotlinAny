package retrieve

fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   $numbers")

    println("sorted : ${numbers.sorted()}")

    val setOfNumber = numbers.toSet()
    println("setOfNumber : $setOfNumber")

    val employers = mutableMapOf<String,Int>("First" to 1,"Second" to 2)
    employers["Three"] = 33
    employers["Four"] = 4
    println( employers.map { "${it.key} is ${it.value}, "}.joinToString ( "and " ) )
    println(employers.map { "${it.key} is ${it.value} " }.joinToString(", ") )

    val triple : (Int) -> Int = {it * 5}
    println(triple(3))
    val uppercase : (String) -> String = {it.uppercase()}
    println(uppercase("alex"))

    val name = listOf("Alex","Boo","John","Maria","Arabella")
    println( name.sorted())
    println(name.sortedWith { str1: String, str2: String -> str1.length - str2.length })

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filterWords = words.filter { it.startsWith("c",ignoreCase = true) }.shuffled().take(1).sorted()
    println(filterWords)

}
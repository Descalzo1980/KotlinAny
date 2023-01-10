package google.collectioninkotlin

fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted:   ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set:   $setOfNumbers")

    val set1 = setOf(1,2,3,8)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")
    println("union : ${setOfNumbers.union(set1)}")
    println("intersect: ${setOfNumbers.intersect(set1)}")

    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges["Boo"] = 42
    peopleAges.put("Barbara", 42)
    peopleAges.put("Barbara", 42)
    peopleAges.put("Barbara", 43)
    println(peopleAges)

    for(people in peopleAges){
        println(people)
    }

    peopleAges.forEach { println("${it.key} is ${it.value}, ") }

    val muMap = println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))

    val filterName = peopleAges.filter { it.key.length < 4 }
    println(filterName)

//    val triple:(Int)-> Int = {it: Int -> it * 3}
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))

    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith{str1: String, str2: String -> str1.length - str2.length })

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWord = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWord)
}
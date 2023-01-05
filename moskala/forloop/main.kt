package moskala.forloop

import moskala.statements.println

fun main() {

//    for (i in 5 downTo 1) {
//        print(i)
//    }
//    for (i in 5 downTo 1) {
//        print(i)
//    }
//    val names = listOf("Alex", "Bob", "Celina")
//
//    for (i in names.indices) {
//        val name = names[i]
//        println("[$i] $name")
//    }
//
//    for((i,name) in names.withIndex())
//        println("[$i] $name")
//
//    names.forEachIndexed{i: Int, name: String ->
//        println("[$i] $name")
//    }
//
//    val capitals = mapOf(
//        "USA" to "Washington DC",
//        "Poland" to "Warsaw",
//        "Ukraine" to "Kiev"
//    )
//    for ((country, capital) in capitals) {
//        println("The capital of $country is $capital")
//    }
//
//    capitals.forEach { (country, capital) ->
//        println("The capital of $country is $capital")
//    }

    val a = mapOf(
        1 to "One",
        2 to "Two",
        1 to "One",
        4 to "Four",
        5 to "One",
        6 to "One",
    )

    val result = a.filter { (key,value)-> value.contains("One")}
    println(result)
    }



//    val tree = Tree(
//        value = "B",
//        left = Tree("A"),
//        right = Tree("D", left = Tree("C"))
//    )
//    for (value in tree) {
//        print(value)
//    }
//

//Map
//    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
//    for(entry in map){
//        println(entry.key.toString() + " : " + entry.value )
//    }
//
////Set
//    val set = setOf(1,2,3)
//    for(entry in set){
//        println(entry)
//    }
//
////List
//    val list = listOf(1,2,3)
//    for(item in list){
//        println(item)
//    }

//class Tree(
//    val value: String,
//    val left: Tree? = null,
//    val right: Tree? = null,
//) : Iterable<String> {
//    override fun iterator(): Iterator<String> = iterator {
//        if (left != null) yieldAll(left)
//        yield(value)
//        if (right != null) yieldAll(right)
//    }
//}

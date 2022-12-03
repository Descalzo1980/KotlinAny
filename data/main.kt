package data

fun main() {

    val userFirst = User("Alex","Boo",23)
    val userSecond = User("John","Boo",23)

    println(userFirst == userSecond)

    println(userFirst.hashCode())
    println(userSecond.hashCode())

    println(userFirst)
}
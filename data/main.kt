package data

fun main() {

    val userFirst = User("Alex","Boo")
    val userSecond = User("Alex","Boo")

    println(userFirst.hashCode())
    println(userSecond.hashCode())


    println(userFirst)
}
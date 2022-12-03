package data

fun main() {

    val userFirst = User("Alex","Boo",23)
    val userSecond = User("Alex","Boo",23)

    println(userFirst == userSecond)

    val result = userFirst == userSecond
    println(result)
    val hashResult = userFirst.hashCode()
    println(hashResult)
    val hashResult2 = userSecond.hashCode()
    println(hashResult2)
    val hashFinish = hashResult == hashResult2
    println(hashFinish)
}
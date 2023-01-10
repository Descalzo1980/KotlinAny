package moskala.nullability

//class UserName(val name: String) {
//    fun cheer() {
//        println("Hello, my name is $name")
//    }
//}
class User(val name: String)

fun printName(user: User?) {
    val name: String = user?.name ?: "default"
    println(name)
}
var user: User? = null
fun main() {
//    user?.cheer() // (does nothing)
//    println(user?.name) // null
//    user = UserName("Cookie")
//    user?.cheer() // Hello, my name is Cookie
//    println(user?.name) // Cookie

//    println(user!!.name.length) // 6
//    user = null
//    println(user!!.name.length)

    printName(User("Boo"))
    printName(null)
}

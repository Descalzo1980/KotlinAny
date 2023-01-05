package moskala.functions

fun cheer(how: String = "Hello,", who: String = "World") {
    println("$how $who")
}
fun main() {
    cheer() // Hello, World
    cheer("".trim(),"John") // Hi World
    println(a(1)) // Int
    println(a(18L)) // Long
    println(a("ABC")) // Any

    var text = Test()
    text hello "Stas"
}
fun a(a: Any) = "Any"
fun a(i: Int) = "Int"
fun a(l: Long) = "Long"

class Test{
    infix fun hello(hello: String){
        println(hello)
    }
}
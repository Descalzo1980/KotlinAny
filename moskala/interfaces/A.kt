package moskala.interfaces

open class A {
    public val a = 10
    public fun b() {
        println(a) // Can use it
    }
}
public const val c = 20
public fun d() {}
class B: A() {
    fun e() {
        println(a) // Can use it
        println(b()) // Can use it
    }
}
fun main() {
    println(A().a) // Can use it
    println(A().b()) // Can use it
    println(c) // Can use it
    println(d()) // Can use it
}
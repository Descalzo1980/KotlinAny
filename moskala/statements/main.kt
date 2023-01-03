package moskala.statements

fun main() {
    printNumberSign(3)
}
fun Any?.print() {
    print(this)
}

fun printNumberSign(number: Number): Int {
    val num = (-10..10).random()
    when{
        num < 0 -> "negative $num"
        num > 0 -> "positive $num"
        else -> "zero"
    }.print()
    return num
}
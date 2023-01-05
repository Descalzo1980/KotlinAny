package moskala.statements

fun main() {

    val a: String? = null
    val b: String = "Hello"
    println(a==b)

    printNumberSign()

    getEmailErrorId("123@fff.com")

    describe(7)

    all()

    val list = listOf(1, 2, 3, 4)
    println(list.joinToString("-")) // 1-2-3-4
// better
    println(list.joinToString(separator = "-", prefix = "A", postfix = "Z")) // 1-2-3-
}
fun Any?.println() {
    println(this)
}

fun printNumberSign(): Int {
    val num = (-10..10).random()
    when{
        num < 0 -> "negative $num"
        num > 0 -> "positive $num"
        else -> "zero"
    }.println()
    return num
}

private fun getEmailErrorId(email: String) = when {
    email.isEmpty() -> "Ok"
    else -> null
}
private val magicNumbers = listOf(7, 13)
fun describe(a: Any?) {
    when (a) {
        null -> println("Nothing")
        1, 2, 3 -> println("Small number")
        in magicNumbers -> println("Magic number")
        in 4..100 -> println("Big number")
        is String -> println("This is just $a")
        is Long, is Int -> println("This is Int or Long")
        else -> print("No idea, really")
    }
}

fun all() {
    generateSequence(1) { it * 2 }
        .takeWhile { it < 10 }
        .forEach(::print)
}
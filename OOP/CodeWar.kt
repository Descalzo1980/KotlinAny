package OOP

fun removeChar(str: String): String = str.substring(1,str.lastIndex)
fun main() {
    val result = removeChar("Hello").apply {
        println(message = this)
    }
}
package moskala.nullab


lateinit var text: String

private fun printIfInitialized() {
    if (::text.isInitialized) {
        println(text)
    } else {
        println("Not initialized")
    }
}
fun main() {
    printIfInitialized() // Not initialized
    text = "ABC"
    printIfInitialized() // ABC
}

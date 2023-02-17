fun main() {
    val word = "abracadabra"
    var count = 0
    for (ch in word.toSet()) {
        if (word.count { it == ch } == 1) {
            count++
        }
    }
    println(count)
}
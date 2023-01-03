package moskala.variables

fun main() {
    val b: Byte = 123
    val l: Long = b.toLong()
    val f: Float = l.toFloat()
    val i: Int = f.toInt()
    val d: Double = i.toDouble()
    println(d) // 123.0
}

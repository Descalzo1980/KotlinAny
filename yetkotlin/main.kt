package yetkotlin

fun toBinary(x: Int, len: Int): String {
    return String.format(
        "%" + len + "s",
        Integer.toBinaryString(x)
    ).replace(" ".toRegex(), "0")
}

fun main() {
    var num = 171
    var len = 8

    println(toBinary(num, len))
}
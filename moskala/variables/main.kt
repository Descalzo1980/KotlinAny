package moskala.variables

fun main() {
    val b: Byte = 123
    val l: Long = b.toLong()
    val f: Float = l.toFloat()
    val i: Int = f.toInt()
    val d: Double = i.toDouble()
    println(d) // 123.0

    val d1 = 1.4
    val d2 = 2.5
    println(d1 + d2) // 3.9
    println(d1 - d2) // -1.1
    println(d1 * d2) // 3.5
    println(d1 / d2) // 0.5599999999999999
    println(5 / 2) // 2, not 2.5
    println(5.toDouble() / 2) // 2.5

    println('%'.code)
    println('\u00A5')
    val text1 = "Let\'s say:\n\"Hooray\""
    println(text1)
// Let's say:
// "Hooray"
    val text2 = """Let\'s say:\n\"Hooray\""""
    println(text2)
// Let\'s say:\n\"Hooray\"
    val text3 = """Let's say:
"Hooray"""".trimIndent()
    println(text3)
// Let's say:
// "Hooray"

    val name = "Cookie"
    val surname = "DePies"
    val age = 6
    val fullName = "$name $surname ($age)"
    println(fullName) // Cookie DePies (6)
    val fullNameUpper =
        "${name.uppercase()} ${surname.uppercase()} ($age)"
    println(fullNameUpper) // COOKIE DEPIES (6)
    val description = """
Name: $name
Surname: $surname
Age: $age
""".trimIndent()
    println(description)
// Name: Cookie
// Surname: DePies
// Age: 6
}

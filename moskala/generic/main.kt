package moskala.generic

import kotlin.random.Random

fun main() {
    id("AAA")
    id(123)
    id(true)
}


fun <T> id(value: T): T = value

package atomic.section2.testing.test2

class Hamster(val name: String) {
    override fun toString() : String {
        return "Hamster(name='$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val hamsters =
        mutableListOf<Hamster>()
    val capacity: Int
        get() = maxCapacity - hamsters.size
    val full: Boolean
        get() = hamsters.size == maxCapacity
    fun put(hamster: Hamster): Boolean =
        if (full)
            false
        else {
            hamsters += hamster
            true
        }
    fun take(): Hamster =
        hamsters.removeAt(0)

    override fun toString() : String {
        return "Cage(maxCapacity=$maxCapacity, hamsters=$hamsters, capacity=$capacity, full=$full)"
    }
}

fun main() {
    val cage = Cage(2)
    println(cage.capacity)
    println(cage.put(Hamster("Alice")))
    println(cage.full)
    println(cage.put(Hamster("Bob")))
    println(cage.full)
    println(cage.capacity)
    println(cage.put(Hamster("Charlie")))
    println(cage.take()).toString()
    println(cage.capacity)
}
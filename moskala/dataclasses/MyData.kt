package moskala.dataclasses

data class Player(
    val id: Int,
    val name: String,
    val points: Int
)

fun main() {
    val player = Player(0, "Gecko", 9999)
    println(player.id)
}




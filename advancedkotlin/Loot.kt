package advancedkotlin

class LootBox<out T : Loot>(val contents: T) {

}
abstract class Hat : Loot(), Sellable

class DropOffBox<T> where T : Loot, T : Sellable {
    fun sellLoot(sellableLoot: T): Int {
        return (sellableLoot.value * 0.7).toInt()
    }
}

abstract class Loot {
    abstract val name: String
}
interface Sellable {
    val value: Int
}

class Fedora(
    override val name: String ,
    override val value: Int
) : Hat()

class Fez(
    override val name: String,
    override val value: Int
) : Hat()

class Gemstones(
    override val value: Int
): Loot(),Sellable{
    override val name = "sack of gemstones worth $value gold"
}
class Key(
    override val name: String
): Loot()

fun main() {
    val lootBox : LootBox<Fedora> = LootBox(Fedora("a generic-looking fedora" , 15))
    val lootBoxTwo : LootBox<Gemstones> = LootBox(Gemstones(150))

    val hatDropOffBox: DropOffBox<Hat> = DropOffBox()
    val fedoraDropOffBox: DropOffBox<Hat> = hatDropOffBox
    fedoraDropOffBox.sellLoot(Fedora("one-of-a-kind fedora", 1000))
}

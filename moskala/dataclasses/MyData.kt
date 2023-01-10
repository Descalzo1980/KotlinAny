package moskala.dataclasses

class MyClass: Cloneable {
    private var field1: Int = 0
    private var field2: String = ""

    public override fun clone(): MyClass {
        val copy = super.clone() as MyClass
        copy.field1 = this.field1
        copy.field2 = this.field2
        return copy
    }
}
data class Player(
    val id: Int,
    val name: String,
    val points: Int
)

fun main() {
    val original = MyClass()
    val copy = original.clone()
    println(original == copy)
    println(original).hashCode()
    println(copy).hashCode()
    val player = Player(0,"Boo",999)
    val id: Int = player.component1()
    val name: String = player.component2()
    val pts: Int = player.component3()
//    val (id,name,pts) = player
    println(id) // 0
    println(name) // Gecko
    println(pts) // 9999


}




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
data class FullName(
    val firstName: String,
    val secondName: String,
    val lastName: String
)
fun String.parseName(): Pair<String, String>? {
    val indexOfLastSpace = this.trim().lastIndexOf(' ')
    if (indexOfLastSpace < 0) return null
    val firstName = this.take(indexOfLastSpace)
    val lastName = this.drop(indexOfLastSpace)
    return Pair(firstName, lastName)
}
fun main() {
    val player = Player(0,"Boo",999)
    val(numberId,namePlayer,pointPlayer) = player
    println("$numberId,$namePlayer,$pointPlayer")

    val elon = FullName(firstName = "Elon", secondName = "Reeve", lastName = "Musk")
    val (name, surname) = elon
    print("It is $name $surname!") // It is Elon Reeve!
    val fullName = "Marcin Moussaka"
    val (firstName, lastName) = fullName.parseName() ?: return
    print("His name is $firstName")
}




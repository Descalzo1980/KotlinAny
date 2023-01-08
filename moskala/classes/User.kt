package moskala.classes

class User {
    var name: String = ""
    var surname: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
    val fullName: String
        get() = "$name $surname"
}

fun main() {
    val user = User()
    user.name = "Boo"
    user.surname = "John"
    println(message = user.fullName) // NORBERT
}


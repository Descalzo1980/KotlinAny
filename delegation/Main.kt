package delegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val user = User()
    with(user){
        firstName = "Alex"
        lastName = "Boo"
    }
    with(user){
        println(firstName)
        println(lastName)
    }

}


class User{
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate : ReadWriteProperty<Any?,String>{
    private var formatString : String = ""

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String {
        return formatString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ) {
        formatString = value.lowercase()
    }
}
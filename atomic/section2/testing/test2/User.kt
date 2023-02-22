package atomic.section2.testing.test2

import javax.jws.soap.SOAPBinding.Use

class User {
    var i : Int = 0
        get() {
            return field
        }
        set(value) {
            field = 3
        }
}
class Cookie( ) {
    var cookie : String = ""
        get() {
            return field
        }
        set(value) {
            field = "Boo"
        }
}
fun main() : Unit {
    val user = User()
    user.i = 4
    println(user.i)
    val x = Cookie()
    x.cookie = "Bar"
    println(x.cookie)
}




package moskala.overloading

import plusandminus.name
import java.util.*

fun main() {
//    val numbers = listOf("one", "two", "three", "four")
//    val (match, rest) = numbers.partition { it.length > 3 }
//
//    val a : Int? = null
//
//    a?.let {  }
//
//    val user = User(22,"Stas")

    val a: Nothing = return
    val b: Nothing = throw Error()

}
const val spas = "Stas"

class User(val age: Int, name: String){
    val soname = name
    fun test(): String {
        return name
    }


}

data class Date(
    var a: String = "Stas"
){
    var b = "Stas"
}
package collections

import java.util.function.Predicate

fun main() {

    val names = mutableListOf("Name 1","Name 2","Name 3")
    names.add(1,"Name 5")
    var newName = Predicate { name:String -> name == "Name 5" }
    remove(names,newName)
    println(names)

    for (name in names){
        println(name)
    }

    println(names[1])
}
fun <T> remove(list: MutableList<T>,predicate: Predicate<T>){
    list.removeIf{x:T->predicate.test(x)}
}
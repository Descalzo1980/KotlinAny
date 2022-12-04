package collections

import java.util.function.Predicate

fun main() {
    val user = User("Name 1")
    val user1 = User("Name 2")
    val user2 = User("Name 3")
    val user3 = User("Name 4")
    val user4 = User("Name 5")
    val user5 = User("Name 6")
    val user6 = User("Alex")
    val user7 = User("Alex")

    val names = mutableListOf("Name 1","Name 2","Name 3","Name 3")
    val names1 = mutableSetOf<String>("Name 1","Name 2","Name 3","Name 3")
    val userNames = mutableSetOf<User>(user,user1,user2,user3,user4,user5,user6,user7)
//    names.add(1,"Name 5")
//    names.removeAt(3)
//    names.forEach { name -> println(name) }
//    println("*********************")
//    names.forEach { println(it) }
//    println("*********************")
//    names1.forEach { println(it) }
    println("*********************")
    userNames.forEach { println(it.name) }

}
data class User(val name: String) // если не data class то дает положить в set одинаковые значения, equals не переписан

fun <T> remove(list: MutableList<T>,predicate: Predicate<T>){
    list.removeIf{x:T->predicate.test(x)}
}

fun<T> removeAll(list: MutableList<T>,predicate: Predicate<T>){
    val newList: MutableList<T> = ArrayList()
    list.filter { predicate.test(it) }.forEach { newList.add(it) }
    list.removeAll(newList)
}
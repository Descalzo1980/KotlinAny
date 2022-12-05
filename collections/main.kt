package collections
fun main() {
    
    val users = mutableMapOf<Int,String>(1 to "Alex",2 to "Boo",3 to "Oui")
    

    users[4] = "John"
    users.forEach { (k, v) ->  println("$k and $v") }
    users.remove(1)
    println("************************************")
    users.forEach { (k, v) ->  println("$k and $v") }
}
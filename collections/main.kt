package collections


fun main() {
    
    val users = mapOf<Int,String>(1 to "Alex",2 to "Boo",3 to "Oui")
    
    users.forEach { (t, u) ->  println("$t : $u") }
}
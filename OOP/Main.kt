package OOP

fun main() {


    val user = User(firstName = "Alex")
    val friend = User("john","Smith")
    val worker = User("Boo","Li",99)
    val user2 = User(age = 19, firstName = "Iona", lastName = "Debbi")

    println("Name =  ${user.firstName}")
    println("LastName =  ${user.lastName}")
    println("Age =  ${user.age}")

    println("\n")

    println("Name =  ${friend.firstName}")
    println("LastName =  ${friend.lastName}")
    println("Age =  ${friend.age}")

    println("\n")

    println("Name =  ${worker.firstName}")
    println("LastName =  ${worker.lastName}")
    println("Age =  ${worker.age}")




}

class User(firstName: String, var lastName:String = "LastName", var age:Int = 0){
    var firstName = firstName
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

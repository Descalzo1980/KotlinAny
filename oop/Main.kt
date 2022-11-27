package oop

fun main() {


    val user = User(firstName = "", lastName = "")

    user.firstName = "Vlad"
    user.lastName = "Nikki"

//    val friend = User("john","Smith")
//    val worker = User("Boo","Li",99)
//    val user2 = User(age = 19, firstName = "Iona", lastName = "Debbi")

    println(user.firstName)
    println(user.lastName)
//    println(user.age)
//
//    println("\n")
//
//    println("Name =  ${friend.firstName}")
//    println("LastName =  ${friend.lastName}")
//    println("Age =  ${friend.age}")
//
//    println("\n")
//
//    println("Name =  ${worker.firstName}")
//    println("LastName =  ${worker.lastName}")
//    println("Age =  ${worker.age}")
}

class User(firstName: String,lastName:String, var age:Int = 0){
    var firstName = firstName
        get() {
            return "FirstName: $firstName"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
    var lastName = lastName
        get() {
            return "LastName : $field"
        }
        set(value) {
            println("$value was assigned to lastName property")
            firstName = value
        }
}

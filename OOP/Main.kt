package OOP

fun main() {


    val user = User(firstName = "Alex")
//    val friend = User("john","Smith")
//    val worker = User("Boo","Li",99)
//    val user2 = User(age = 19, firstName = "Iona", lastName = "Debbi")

    println(user.firstName)
    println(user.lastName)
    println(user.age)
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

class User(firstName: String,lastName:String = "LastName", var age:Int = 0){
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
    var lastName = lastName
        get() {
            return "Last name : $field"
        }
        set(value) {
            println("$value was assigned to lastName property")
        }
}

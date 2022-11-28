package oop

fun main() {
    val user = User("Alex","Boo",33)
    val user1 by lazy {
        User("User1", "lastName",8)
    }
    println(user1.firstName)

}

class User(var firstName: String, var lastName: String,var age:Int){
    init{
        println("User : $firstName was created")
    }
}

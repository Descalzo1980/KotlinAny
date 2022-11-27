package oop

fun main() {


    val user = User(firstName = "Alex", lastName = "Debby", age = 37)
//    user.company = "Apply"
    println(user.company)

}

class User(var firstName: String,var lastName:String, var age:Int = 0){
    lateinit var company: Int
}

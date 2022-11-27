package oop

fun main() {


    val user = User(firstName = "", lastName = "")

    user.firstName = "Vlad"
    user.lastName = "Nikki"

    println(user.firstName)
    println(user.lastName)
}

class User(firstName: String,lastName:String, var age:Int = 0){
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
            return "LastName : $field"
        }
        set(value) {
            println("$value was assigned to lastName property")
            field = value
        }

    fun setFirstName(newValue : String){
        this.firstName = newValue
    }

    fun getFirstName() : String{
        return this.firstName
    }
}

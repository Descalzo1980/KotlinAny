package OOP

fun main() {
    val user = User("Alex")
    val friend = User("john","Smith",40)

}

class User(var name: String,var lastName:String,var age:Int){

    constructor(name : String) : this(name ,"Last Name",0)
}

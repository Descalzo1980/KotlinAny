package OOP

fun main() {
    val user = User("Alex","Boo",33)
    val friend = User("john","Smith",40)

    println("Name ${friend.name}")
}

class User(name: String,var lastName:String,var age:Int){
    var name : String

    init {
        if(name.lowercase().startsWith("a")){
            this.name = name
        }else{
            this.name = "User"
            println("The name doesn't with the letter 'a' or 'A' ")
        }
    }

    init {

    }

}

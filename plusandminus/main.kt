package plusandminus

fun main() {
    val numbers = mutableListOf("one","two","three","four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three","four").toSet()
    println(plusList)
    println(minusList)
    checkName()
    val number: Int? = null
    println(number ?: "Number is null")
}

lateinit var name : String


fun checkName(){
    if(::name.isInitialized){
        println("My name is $name")
    }else{
        println("We need name")
    }
}



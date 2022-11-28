package oop

fun main() {
    val instance = Database.getInstance()
    val instance2 = Database.getInstance()
    println(instance)
    println(instance2)
}

class Database private constructor(){
    companion object{
        private var instance: Database? =null
        fun getInstance(): Database? {
            if(instance == null){
                instance = Database()
            }
            return instance
        }
    }
}
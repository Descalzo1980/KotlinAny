package oop

fun main() {

}

class Database private constructor(){
    companion object{
        private var instance: Database? =null
        fun getInstance(){
            if(instance == null){
                instance = Database()
            }
        }
    }
}
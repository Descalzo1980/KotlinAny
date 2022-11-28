package oop

fun main() {
    Calculator.sum(5,10)
}

class Calculator(){
    companion object{
        fun sum(a: Int, b: Int) = a + b
    }

}
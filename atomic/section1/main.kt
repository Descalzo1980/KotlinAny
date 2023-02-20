package atomic.section1


fun main(){
//    showRange(1..5)
//    showRange(0 until 5)
//    showRange(5 downTo  1)
//    showRange(0..9 step 2)
//    showRange(0 until 10 step 3)
//    showRange(9 downTo 2 step 4)
//println(hasChar("kotlin", 't'))
//println(hasChar("kotlin", 'a'))
//    inFloatRange(0.999999)
//    inFloatRange(5.0)
//    inFloatRange(10.0)
//    inFloatRange(10.0000001)
    val i1 = 11
    val i2 = 100
    val c1 = 'K'
    val c2 = 'k'
    println("$i1 ${inNumRange(i1)}")
    println("$i2 ${inNumRange(i2)}")
    println("$c1 ${notLowerCase(c1)}")
    println("$c2 ${notLowerCase(c2)}")
}

fun inNumRange(n: Int) = n in 50..100
fun notLowerCase(ch: Char) = ch !in 'a' downTo 'Z'

fun inFloatRange(n: Double) {
    val r = 1.0..10.0
    println("$n in $r? ${n in r}")
}

fun hasChar(s: String,ch: Char): Boolean{
    for(c in s){
        if(c == ch) return true
    }
    return false
}
fun showRange(r: IntProgression){
    for (i in r){
        print("$i ")
    }
    print(" //$r")
    println()
}

fun oneOrTheOrder(exp: Boolean): Any =
    if (exp)
        println("True")
    else
        println("False")

fun bmiMetric(weight: Double,height: Double): String{
    val bmi = weight /(height * weight)
    return when (bmi) {
        in 0.0..18.4 -> "Underweight"
        in 18.5..24.9 -> "Normal weight"
        in 25.0..29.9 -> "Overweight"
        in 30.0..34.9 -> "Class I obesity"
        in 35.0..39.9 -> "Class II obesity"
        else -> "Class III obesity"
    }
}

fun findIndexOfMinElement(numbers: List<Int>): Int {
    var minIndex = 0
    for (i in numbers.indices) {
        if (numbers[i] < numbers[minIndex]) {
            minIndex = i
        }
    }
    return minIndex
}

/*
• A statement changes state.
• An expression expresses.
*/
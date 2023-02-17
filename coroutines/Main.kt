package coroutines

import sun.rmi.runtime.Log
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val numberOfPeople = 0
    val numberOfPizzas = 20
//    println("Slices per person: ${numberOfPizzas / numberOfPeople}")

    val nums = listOf(10, 20, 100, 5)
    val isAny = nums.any() // true
    val isAnyOdd = nums.any { it % 2 > 0 } // true
    val isAnyBig = nums.any { it > 1000} // false

    val isAny1 = nums.all { it % 1 > 0 }

    val nums1 = listOf(10, 20, 100, 5,null)
    val numbers = nums.filterNotNull()

    println(numbers)

    println(isAnyOdd)
    val numbers2 = listOf(1, 20, 18, 37, 2)
    val groupedNumbers = numbers2.groupBy {
        when {
            it < 20 -> "less than 20"
            else -> "greater than or equal to 20"
        }
    }
    println(groupedNumbers)

}

enum class GymActivity {
    BARRE, PILATES, YOGA, FLOOR, SPIN, WEIGHTS
}
enum class LENGTH(val value: Int) {
    TEN(10), TWENTY(20), THIRTY(30), SIXTY(60);
}
val <T> T.exhaustive: T
    get() = this
fun requiresEquipment(activity: GymActivity) = when (activity) {
    GymActivity.BARRE -> true
    GymActivity.PILATES -> true
    GymActivity.YOGA -> false
    GymActivity.FLOOR -> false
    GymActivity.SPIN -> true
    GymActivity.WEIGHTS -> true
}.exhaustive

interface Result
data class Success(val data: List<Int>) : Result
data class Failure(val error: Throwable?) : Result

sealed class Result1
data class Success1(val data: List<Int>) : Result1()
data class Failure1(val error: Throwable?) : Result1()

val list = mutableListOf(1L, 3.14, "e")





fun getResult(): Result = try {
    Success(getDataOrExplode())
} catch (e: Exception) {
    Failure(e)
}

fun getDataOrExplode() : List<Int> {
    return listOf(1,2,3,4,5,6)
}

fun processResult(result: Result): List<Int> = when (result) {
    is Success -> result.data
    is Failure -> listOf()
    else -> throw IllegalArgumentException("unknown result type")
}


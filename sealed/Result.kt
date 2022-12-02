package sealed

import java.lang.Error


fun main() {
    val success = Result.Success("Success!")
    val error = Result.Error("Error!")
    val process = Result.Error("Progress")
    getData(process)

}


//enum class Result {
//    SUCCESS,
//    ERROR
//}

fun getData(result: Result){
    when(result){
        is Result.Error -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}

sealed class Result (private val message : String){
    fun showMessage(){
        println("Result : $message")
    }
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
    class Progress(message: String) : Result(message)
}


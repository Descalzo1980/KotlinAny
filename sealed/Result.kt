package sealed

import java.lang.Exception


fun main() {
    val success = Result.Success("Success!")
    val process = Result.Progress("Progress")
    getData(success)

}


//enum class Result {
//    SUCCESS,
//    ERROR
//}

fun getData(i: Result){
    when(i){
        is Result.Progress -> i.showMessage()
        is Result.Success -> i.showMessage()
        is Result.Error.NonRecoverableError -> i.showMessage()
        is Result.Error.RecoverableError -> i.showMessage()
    }
}

sealed class Result (private val message : String){
    fun showMessage(){
        println("Result : $message")
    }
    class Success(message: String) : Result(message)
    sealed class Error(message: String) : Result(message){
        class RecoverableError(exception: Exception,message: String) : Error(message)
        class NonRecoverableError(exception: Exception,message: String) : Error(message)
    }
    class Progress(message: String) : Result(message)
}


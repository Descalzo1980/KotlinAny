package moskala.sealedclasses

sealed class Response<out V>
class Success<V>(val value: V) : Response<V>()
class Failure(val error: Throwable) : Response<Nothing>()

fun handle(response: Response<String>){
    val text = when(response){
        is Failure -> "Error"
        is Success -> "Success with ${response.value}"
    }
    print(text)
}

//fun handle(response: Response<String>) {
//    val text = when (response) {
//        is Success -> "Success with ${response.value}"
//        is Failure -> "Error"
//// else is not needed here
//    }
//    print(text)
//}
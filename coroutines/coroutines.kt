package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main() {
        runBlocking {
            println("Weather forecast")
            try {
                println(getWeatherReport())
            }catch (e: AssertionError){
                println("Caught exception in runBlocking(): $e")
                println("Report unavailable at this time")
            }
            println("Have a good day!")
        }
    }

suspend fun getForecast() : String{
    delay(1000)
    return ("Sunny")
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async {
        try {
            getTemperature()
        }catch (e: Exception){
            println("Caught exception $e")
            "{ No temperature found }"
        }
    }
    "${forecast.await()} ${temperature.await()}"
}

suspend fun getTemperature(): String {
    delay(500)
    throw AssertionError("Temperature is invalid")
    return ("30\u00b0C")
}
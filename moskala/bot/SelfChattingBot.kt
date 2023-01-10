package moskala.bot

class SelfChattingBot {
    fun start() {
        println("Bot: Hello, how can I help you today?")
        while (true) {
            val input = readln()
            if (input == "bye") {
                println("Bot: Goodbye!")
                break
            } else {
                println("Bot: You said: $input")
            }
        }
    }
}

class WeightMeasurement {
    private var weight: Double = 0.0

    fun getWeight(): Double {
        return weight
    }

    fun setWeight(newWeight: Double) {
        weight = newWeight
    }
}

fun main(){
    val bot = SelfChattingBot()
    bot.start()

    val measurement = WeightMeasurement()
    println("Enter your weight in kg:")
    val inputWeight = readln()?.toDouble()
    measurement.setWeight(inputWeight ?: 0.0)
    println("Your weight is: ${measurement.getWeight()} kg")
    val result = measurement.getWeight()
    println(result)
}

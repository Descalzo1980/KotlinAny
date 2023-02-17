package messages

fun main() {
    // Who sent the most messages?
    val frequentSender = messages
        .groupBy(Message::sender)
        .maxByOrNull { (_, messages) -> messages.size }
        ?.key // #1
    println(frequentSender) // [Ma]
    val senders = messages
        .asSequence() // #2
        .filter { it.body.isNotBlank() && !it.isRead } // #3
        .map(Message::sender) // #4
        .distinct()
        .sorted()
        .toList() // #5
    println(senders) // [Adam, Ma]

    val messages = listOf( // #8
        Message("Ma", "Hey! Where are you?"),
        Message("Adam", "Everything going according to plan today?"),
        Message("Ma", "Please reply. I've lost you!"))

    val people = listOf(Person("John", "Doe", 30), Person("Jane", "Smith", 25), Person("Jim", "Doe", 35))
    val sortedPeople = people.sortedWith(compareBy({ it.lastName }, { it.firstName }))
    println(sortedPeople)

    val mySong: String? = null

}
data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
)


data class Message( // #6
    val sender: String,
    val body: String,
    val isRead: Boolean = false // #7
)
val messages = listOf( // #8
    Message("Ma", "Hey! Where are you?"),
    Message("Adam", "Everything going according to plan today?"),
    Message("Ma", "Please reply. I've lost you!"),
)




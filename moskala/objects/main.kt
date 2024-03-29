package moskala.objects

data class User(val name: String)

interface UserProducer{
    fun produce(): User
}

object FakeUserProducer: UserProducer {
    override fun produce(): User = User("fake")
}

fun setUserProducer(producer: UserProducer){
    println(producer.produce())
}
fun main(){
    setUserProducer(FakeUserProducer)
}
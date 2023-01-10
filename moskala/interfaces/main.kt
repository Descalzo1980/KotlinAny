package moskala.interfaces

fun main() {
    val repo = FakeUserRepository()
    repo.addUser(User(123, "Boo"))
    val user = repo.findUser(123)
    println(user?.name) // Zed
}
package moskala.interfaces

class FakeUserRepository : UserRepository {

    private var users = listOf<User>()

    override fun getUsers(): List<User> = users

    fun addUser(user: User) {
        users += user
    }

}
package moskala.interfaces


interface UserRepository {
    fun findUser(id: Int): User? =
        getUsers().find{it.id == id}

    fun getUsers(): List<User>

}
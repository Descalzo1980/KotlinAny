package data

data class User(val firstName : String,val lastName : String,val age : Int ){

    override fun equals(other: Any?): Boolean {
        if (this === other){
            return true
        }
        if (other is User){
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }
        return false
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "User(firstName = $firstName,lastName = $lastName,age = $age)"
    }
}
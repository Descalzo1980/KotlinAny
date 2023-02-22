package atomic.section2.testing

class Hamster(val name: String) {
    override fun toString(): String {
        return "Hamster('$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val hamsters =
        mutableListOf<Hamster>()

    fun put(hamster: Hamster): Boolean =
        if (hamsters.size == maxCapacity)
            false
        else {
            hamsters += hamster
            true
        }

    fun get(name: String): Hamster {
        for (hamster in hamsters) {
            if (hamster.name == name) {
                return hamster
            }
        }
        throw NoSuchElementException("No hamster called $name")
    }
}

fun main() {
    val cage = Cage(2)
    cage.put(Hamster("Alena"))
    cage.get("Alena")
}


//class Contact(val name: String , private val number: Int){
//    override fun toString() : String {
//        return "Contact(name='$name', number=$number)"
//    }
//}
//
//fun doMap(contactList : List<Contact>): Map<String,Contact>{
//    val myMap = mutableMapOf<String,Contact>()
//    for (contact in contactList){
//        myMap[contact.name] = contact
//    }
//    return myMap
//}
//
//
//fun main(){
//    val contactList = listOf(
//    Contact("Stas",1),
//    Contact("Alena",2))
//    val myResult = doMap(contactList)
//    print(myResult)
//}
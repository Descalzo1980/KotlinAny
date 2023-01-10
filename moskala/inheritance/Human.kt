package moskala.inheritance

class Human: Mammal() {
    override fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        } else {
            println("Feeding young with milk from bottle")
        }
    }

    fun feedYoung(mammal: Mammal){
        mammal.feedYoung()
    }
}
package moskala.inheritance

class Cat: Mammal() {
    override fun feedYoung() {
        if(canFeed){
            println("Feeding young with milk")
        }else{
            println("Feeding young with milk from bottle")
        }
    }
}
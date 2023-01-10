package moskala.inheritance

abstract class Mammal {
    val haveHairOrFur = true
    val warmBlooded = true
    var canFeed = false

    abstract fun feedYoung()
}
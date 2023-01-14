package google.collectioninkotlin

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystemAll = rockPlanets + gasPlanets
//    for (i in solarSystemAll){
//        println(i)
//    }
//    solarSystemAll[3] = "Little Earth"
//    for (i in solarSystemAll){
//        println(i)
//    }

//    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

//    println(solarSystem.size)
//    println(solarSystem[3])
//    println(solarSystem.indexOf("Mars"))
//    println(solarSystem.indexOf("Pluto"))

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    solarSystem.add("Pluto")

    for (i in solarSystem){
        println(i)
    }
    println("Mars" in solarSystem)

}
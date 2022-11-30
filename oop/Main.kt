package oop

fun main() {
    when(Direction.valueOf("east".uppercase())){
        Direction.EAST -> {
            println("The direction is East" )
        }
        Direction.WEST -> println("The direction is West" )
        Direction.SOUTH -> println("The direction is South" )
        Direction.NORTH -> println("The direction is North" )
    }
}


package search

fun main() {
    println(searchElement(15, mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)))

}

//private fun searchElement(searchElement : Int,numbers: MutableList<Int>) : Int{
//    var i = 0
//    for(number in numbers){
//        i++
//        println("Searched number: $i")
//        if(number == searchElement){
//            return number
//        }
//    }
//    return -1
//}
//private fun searchElement(searchElement : Int,numbers: MutableList<Int>) : Int{
//    var low = 0
//    val high = numbers.size -1
//    var i = 0
//    while (low <= high){
//        i++
//        println("Searched number: $i")
//        val mid = (low + high) / 2
//        val comp = numbers[mid].compareTo(searchElement)
//        low = if(comp < 0){
//            mid + 1
//        }else if(comp > 0){
//            mid -1
//        }else{
//            return numbers[mid]
//        }
//    }
//    return -1
//}

private fun searchElement(searchElement : Int,numbers: MutableList<Int>) = numbers[numbers.binarySearch ( 15 )]

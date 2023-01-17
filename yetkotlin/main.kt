package yetkotlin

fun toBinary(x: Int, len: Int): String {
    return String.format(
        "%" + len + "s",
        Integer.toBinaryString(x)
    ).replace(" ".toRegex(), "0")
}

fun main() {
    val num = 2
    val len = 8

    println(toBinary(num, len))

    var i = 1
    while (i < 20)
    {
        i += 1
        if (i % 2 != 1) {
            continue
        }
        println("i = $i")
    }

    val result = sayMyName(name = "Alex",age = 29)
    println(result)

    var myArray = intArrayOf(1,2,3,4,5,6)
    myArray.size
    var arr = IntArray(5) { it * 1 }
    for (i in arr){
        println(i)
    }

    println("Hello")
    val nextmessage = "Goodbye"

}

fun sayMyName(name: String,age: Int) : String{
    return ("Your name is $name and your age is $age")
}

fun someArguments(array: Array<String>) :Array<String>{
    return array
}
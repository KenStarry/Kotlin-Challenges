package arrays

fun main(args: Array<String>) {

    //  method 1: emptyArray() function
    val emptyArr: Array<Int> = emptyArray()
    val emptyArr2 = emptyArray<Int>()

    //  method 2: arrayOf() function
    val emptyArrOf: Array<Int> = arrayOf()
    val emptyArrOf2 = arrayOf<Int>()

    println("Empty array size = ${emptyArrOf.size}")
}

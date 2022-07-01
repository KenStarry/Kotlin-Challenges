package arrays

fun main(args: Array<String>) {

    val arr = intArrayOf(2, 4, 6, 8, 10)

    println(averageOfArray(*arr))

}

fun printArray(vararg arr: Int) {

    //  Print all the arrays
    for (item in arr) {
        print("$item ")
    }
}

fun averageOfArray(vararg arr: Int): Double {

    var sum: Int = 0

    for (item in arr) {

        sum += item
    }

    return sum / (arr.size).toDouble()

}


package basics

fun main(args: Array<String>) {

    //  Read a string from the user
    print("Enter string : ")
    val s: String = readLine()!!

    print("Check Character : ")
    val character: Char = readLine()!![0]

    var count: Int = 0

    for (i in s) {

        if (i == character) {
            count += 1
        }

    }

    println("$character appears $count times")

}
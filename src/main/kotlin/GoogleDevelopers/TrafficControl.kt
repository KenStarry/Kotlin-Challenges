package GoogleDevelopers

fun main(args: Array<String>) {

    print("Enter traffic light color : ")

    val status = when (readLine()!!.lowercase()) {
        "red" -> "Stop"
        "orange" -> "Wait"
        "green" -> "Go"
        else -> "Invalid traffic color"
    }

    println(status)

}

package basics

fun main() {

    val a: Int = 56

    println("$a is an ${checkEvenOdd(a)}")

}

//  Function to check whether the number is even or odd
fun checkEvenOdd(x: Int): String {

    return if (x % 2 == 0) "Even Number" else "Odd number"
}
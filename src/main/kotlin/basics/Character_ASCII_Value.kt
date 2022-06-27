package basics

fun main() {

    val c: Char = 'k'
    val ascii = c.code
    val charMinus = c.dec()

    println("The int value of $c is $ascii and deduct one is $charMinus")
}
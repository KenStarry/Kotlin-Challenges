package basics

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Display numbers upto ? ")
    val input: Int = reader.nextInt()

    number_range(input)

}

//  Function to print numbers
fun number_range(n: Int = 100) {

    for (i in 1..n) {
        println(i)
    }
}
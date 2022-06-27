package basics

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    print("Multiplication table of : ")
    val input = scan.nextInt()

    for (i in 0..9) {

        println("$input * $i = ${input * i}")
    }

}
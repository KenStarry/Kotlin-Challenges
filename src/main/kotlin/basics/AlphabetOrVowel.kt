package basics

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    val c: Char = reader.nextLine()[0]

    //  Do a check using when statement
    when(c) {

        'a' -> println("Vowel")
        'e' -> println("Vowel")
        'i' -> println("Vowel")
        'o' -> println("Vowel")
        'u' -> println("Vowel")
        else -> println("consonant")
    }
}
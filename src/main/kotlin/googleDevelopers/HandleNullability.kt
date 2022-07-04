package googleDevelopers

fun main(args: Array<String>) {

    //  Finding length of a nullable string
    var favSinger: String? = "Bebe Rexha"
    println("Favourite Actor is $favSinger and his name's length is ${favSinger?.length}")

    //  Ensure the variable is never null
    println("${favSinger!!.length} can never be null!")

    //  Conditions to check for null values
    if (favSinger != null)
        println("Never null")

    //  ELVIS OPERATOR
    println("Who's your fav person? ")
    val favPerson: String? = null

    val result = favPerson ?: "No one!"
    println(result)
}

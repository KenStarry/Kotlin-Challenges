package arrays

fun main(args: Array<String>) {

    val nums = intArrayOf(32, 66, 77, 13, 43, 55)

    println("The smallest element is ${smallestArrayElement(*nums)}")

}

fun smallestArrayElement(vararg nums: Int): Int {

    var smallest = nums[0]

    for (item in nums) {

        smallest = if (item < smallest) item else smallest
    }

    return smallest
}
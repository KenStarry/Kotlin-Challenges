package arrays

fun main() {

    val nums = intArrayOf(25, 11, 43, 21, 87, 55, 64)

    println("The largest element = ${largestElementInArray(*nums)}")

}

//  Largest element in the array
fun largestElementInArray(vararg nums: Int): Int {

    var largest: Int = nums[0]

    for (item in nums) {

        largest = if (item > largest) item else largest
    }

    return largest
}
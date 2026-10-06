// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val numbers = args[0].toInt()

    var sum = 0L

    for (number in 1..numbers step 2) {
        sum += number
    }

    println(sum)
}

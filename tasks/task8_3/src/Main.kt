// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val dataset = fetchData(args[0])

    val lowest = dataset.minBy { it.second }
    val highest = dataset.maxBy { it.second }

    println("Coldest station: ${lowest.first}, ${lowest.second}")
    println("Warmest station: ${highest.first}, ${highest.second}")

    val average = dataset.sumOf { it.second } / dataset.size

    System.out.printf("Average temperature: %.2f%n", average)
}

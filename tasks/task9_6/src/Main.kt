// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try {
        require(args.size == 1) {
            "Please provide exactly one filename"
        }

        val data = readData(args[0])
        val result = variance(data)

        println("Number of values: %{data.size}")
        System.out.printf("Variance: %.5f%n", result)
    } catch (problem: Exception) {
        println("Error: ${problem.message}")
        exitProcess(1)
    }
}

// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    val initialTemp = args[0].toDouble()
    val maximumTemp = args[1].toDouble()
    val increment = args[2].toDouble()

    var celsius = initialTemp

    println(" Celsius Fahrenheit")

    while (celsius <= maximumTemp) {
        val fahrenheit = celsius * 9.0 / 5.0 + 32.0
    }

        println("%8.1f %10.1f".format(celsius, fahrenheit))

        celsius += increment
}

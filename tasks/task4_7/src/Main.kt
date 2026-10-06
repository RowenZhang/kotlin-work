// Task 4.7: finding the longest line in a file
import java.io.File

fun main(args: Array<String>) {
    val filePath = args[0]

    var longestLength = 0
    var longestLineNumber = 0
    var currentLineNumber =0

    File(filePath).forEachLine {
        line -> currentLineNumber++

        if (line.length > longestLength) {
            longestLength = line.length
            longestLineNumber = currentLineNumber
        }
    }

    println("Line \$longestLineNumber is the longest (length = \$longestLength)")
}
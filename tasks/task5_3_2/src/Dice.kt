// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, dice: Int = 1) {

    var total = 0

    for (i in 1..dice) {
        total += Random.nextInt(1, sides + 1)
    }

    println("Total score: $total")
}
// Task 5.3.2: main program
fun main(args: Array<String>) {

    val specification = args[0]

    val dice = specification.substringBefore("d").toInt()
    val sides = specification.substringAfter("d").toInt()

    rollDice(sides = sides, dice = dice)
}
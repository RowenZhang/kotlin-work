// Task 5.1.2: main program
fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Please provide the number of die sides.")
        return
    }

    val sides = args[0].toInt()

    rollDie(sides)
}
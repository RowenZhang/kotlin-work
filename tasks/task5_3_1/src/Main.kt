fun main(args: Array<String>) {

    if (args.isEmpty()) {
        rollDie()
    } else {
        val sides = args[0].toInt()
        rollDie(sides)
    }
}
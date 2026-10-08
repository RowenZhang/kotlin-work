// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)

    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())

    numbers[0] = 10
    println(numbers[0])

    numbers.add(1)
    println(numbers)

    numbers.addAll(listOf(10, 11))
    println(numbers)

    numbers.remove(3)
    println(numbers)

    numbers.removeAll(listOf(6, 8))
    println(numbers)

    numbers.clear()
    println(numbers)
}
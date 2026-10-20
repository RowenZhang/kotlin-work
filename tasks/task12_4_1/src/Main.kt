// Task 12.4.1: main program
fun main() {
    val circle = Circle(Point(0.0, 0.0), 5.0)

    println(circle.area())
    println(circle.perimeter())

    println(circle.contains(Point(3.0, 4.0)))
}
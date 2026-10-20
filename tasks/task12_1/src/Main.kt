// Task 12.1: program that uses a Point object
fun main() {
    val p = Point(3.0, 4.0)

    println(p.x)
    println(p.y)
    println(p.distance())

    val q = Point(4.5, 7.0)
    println(q.distanceTo(q))
}
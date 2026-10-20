// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(
    val centre: Point,
    val radius: Double
) {
    init {
        require(radius > 0.0) {
            "Radius must be positive"
        }
    }

    fun area() = PI * radius * radius

    fun perimeter() = PI * 2.0 * radius

    fun contains(point: Point): Boolean {
        return centre.distanceTo(point) <= radius
    }
}
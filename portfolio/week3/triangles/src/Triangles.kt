import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(triangle: Triangle):Boolean {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    if (a < b + c &&
        b < a + c &&
        c < a + b) {
        return true
    }
    else {
        return false
    }
}


fun triangleArea(triangle: Triangle):Double {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    if (!isValidTriangle(triangle)) {
        throw IllegalArgumentException()
    }

    val s = (a + b + c) / 2

    return sqrt(s * (s - a) * (s - b) * (s - c))
}
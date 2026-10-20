// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Jeff", "1997-08-23")

    println(p.name)
    println(p.birth)
    println(p.isMarried)
}
// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Jeff", LocalDate(2005, 8, 18))
    println(p.name)

    p.name = ""
}
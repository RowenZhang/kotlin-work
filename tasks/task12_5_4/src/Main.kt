// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Jeff", LocalDate(2005, 8, 18))

    println(p.age)
}
// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "Hello Kotlin 2026"

    val letters = text.howMany { it.isLetter() }
    val digits = text.howMany { it.isDigit() }
    val vowels = text.howMany { it.lowercase() in "aeiou" }

    println("Letters: $letters")
    println("Digits: $digits")
    println("Vowels: $vowels")
}

// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU")
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian")
    print("Choose your pizza (a-b):")

    val choice = readln().lowercase()

    if (choice.length == 1 && choice[0] in 'a'..'d') {
        println("Order Accepted")
    }
    else {
        println("Order Rejected，Invalid Input")
    }
}

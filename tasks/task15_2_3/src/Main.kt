// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val account = SavingsAccount("Tom", 1.8)

    account.deposit(1250)

    repeat(5) {
        account.applyInterest()
    }

    account.withdraw(50)

    println(account.balance)
}

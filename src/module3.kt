
fun main() {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    var accountType = ""
    var userChoice = 0

    while (accountType == "") {
        userChoice = (1..3).random() // Randomly choosing an account type for demonstration
        println("Selected option: $userChoice")

        accountType = when (userChoice) {
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> ""
        }
    }

    println("You have created a $accountType account.")

    // Step 2: Implement the transfer operation for checking, debit and credit accounts
    fun transfer(mode: String) {
        val transferAmount: Int

        when (mode) {
            "withdraw" -> {
                if (accountType == "debit") {
                    transferAmount = debitWithdraw(money)
                } else {
                    transferAmount = withdraw(money)
                }
                println("The amount you withdrew is ${transferAmount} dollars.")
            }
            "deposit" -> {
                if (accountType == "credit") {
                    transferAmount = creditDeposit(money)
                } else {
                    transferAmount = deposit(money)
                }
                println("The amount you deposited is ${transferAmount} dollars.")
            }
            else -> return
        }
    }

    // Step 3: Create variables for the virtual bank system interface status and user interface option
    var isSystemOpen = true
    var option = 0

    // Step 4: Manage the bank account based on the user interface option
    while (isSystemOpen) {
        println("What would you like to do?")
        println("1. Check bank account balance")
        println("2. Withdraw money")
        println("3. Deposit money")
        println("4. Close the system")
        println("Which option do you choose? (1, 2, 3 or 4)")

        option = (1..5).random() // Generate a random number for the user's input
        println("The selected option is ${option}.")

        when (option) {
            1 -> println("The current balance is ${accountBalance} dollars.")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> {
                isSystemOpen = false
                println("The system is closed")
            }
            else -> continue
        }
    }
}

// Placeholder functions and variables for demonstration
var accountType = "checking" // Placeholder, set this based on user choice
var money = 1000 // Placeholder for demonstration
var accountBalance = 5000 // Example balance for demonstration

fun debitWithdraw(amount: Int): Int {
    accountBalance -= amount
    return amount
}

fun withdraw(amount: Int): Int {
    accountBalance -= amount
    return amount
}

fun creditDeposit(amount: Int): Int {
    accountBalance += amount
    return amount
}

fun deposit(amount: Int): Int {
    accountBalance += amount
    return amount
}

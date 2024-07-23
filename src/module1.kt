fun main() {
    // interface
    println("Welcome to your Banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    println("Choose an option (1, 2 or 3)")

    var accountType = ""
    var userChoice = 0

    // user input
    while (accountType == "") {
        println("Choose an option (1, 2 or 3)")
        userChoice = (1..5).random()
        println("Your choice is $userChoice")
        when (userChoice) {
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> continue
        }
    }
    println("You have created a $accountType account")
}

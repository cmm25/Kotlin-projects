fun main(){
    var accountBalance = (0..1000).random()
    val money = (0..1000).random()
    println("The checking balance is $accountBalance dollars.")
    println("The amount to be deposited/withdrawn is $money dollars.")

    // test variable
    var output = 0
    // widthdrawal operation
    fun withdraw( amount:Int) :Int{
        accountBalance -= amount
        println("You have withdrawn $amount dollars. The updated balance is $accountBalance dollars.")
        return amount
    }
    // test widthdrawal
    output = withdraw(money)
    println("Withdrawal operation result: $output dollars.")
    // step 5: widthdrawal information
    fun debitWithdraw(amount: Int): Int {
        return if (accountBalance == 0) {
            println("Can't withdraw, no money on this account!")
            accountBalance
        } else if (amount > accountBalance) {
            println("Not enough money on this account! The checking balance is $accountBalance dollars.")
            0
        } else {
            withdraw(amount)
        }
    }
    // Step 6: Test the debit withdrawal operation
    output = debitWithdraw(money)
    println("Debit withdrawal operation result: $output dollars.")

    // Step 7: The deposit operation for checking and debit accounts
    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("You have deposited $amount dollars. The updated balance is $accountBalance dollars.")
        return amount
    }
    // Step 8: Test the deposit operation for checking and debit accounts
    output = deposit(money)
    println("Deposit operation result: $output dollars.")

    // Step 9: Implement the deposit operation for credit accounts
    fun creditDeposit(amount: Int): Int {
        return if (accountBalance == 0) {
            println("No need to deposit, the account is already paid off.")
            accountBalance
        } else if ((accountBalance + amount) > 0) {
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is $accountBalance dollars.")
            0
        } else if (accountBalance + amount == 0) {
            println("You deposited just enough money to completely pay off the account.")
            amount
        } else {
            deposit(amount)
        }
    }

    // Step 10: Test the credit deposit operation
    output = creditDeposit(money)
    println("Credit deposit operation result: $output dollars.")

}
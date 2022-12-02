package oop

fun main() {
    var account = BankAccountClass("Boo")
    println(account.balance)
    account.deposit(1000)
    account.withdraw(500)
    account.deposit(-19)
    account.withdraw(-100)

    val calculator = account.calculateBalance()
    println(calculator)


}

class BankAccountClass(val accountName : String) {

    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount > 0){
            transactions.add(amount)
            balance += amount
            println("$amount deposit. Balance is now ${this.balance}")
        }else{
            println("Can't deposit negative sums")
        }
    }

    fun withdraw(withdrawal :Int){
        if(-withdrawal < 0){
            transactions.add(-withdrawal)
            this.balance +=withdrawal
            println("$withdrawal withdrawn. Balance is now ${this.balance}")
        }else{
            println("Can't withdrawn negative sums")
        }
    }

    fun calculateBalance() : Int{
        this.balance = 0
        for (transaction in transactions){
            this.balance += transaction
        }
            return this.balance
    }
}
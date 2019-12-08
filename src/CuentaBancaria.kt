import com.company.Bank.BankAccountBuilder


fun main() {
    val builder = BankAccountBuilder(12345L)
    val bankAccount = builder.withBalance(1000.20)
            .withOwner("Nahomi Michell")
            .withRate(10.15)
            .build()
    println(bankAccount)
}

class CuentaBancariaBuilder: IBuilder {
    private var accountNumber: Long = 0
    private var owner: String? = null
    private var balance = 0.0
    private var interestRate = 0.0

    fun CuentaBancariaBuilder(accountNumber: Long) {this.accountNumber = accountNumber}

    fun withOwner(owner: String?): CuentaBancariaBuilder {
        this.owner = owner
        return this
    }

    fun withBalance(balance: Double): CuentaBancariaBuilder {
        this.balance = balance
        return this
    }

    fun withRate(interestRate: Double): CuentaBancariaBuilder {
        this.interestRate = interestRate
        return this
    }

    override fun build(): CuentaBancaria {
        val account = CuentaBancaria()
        account.accountNumber = accountNumber
        account.owner = owner
        account.balance = balance
        account.interestRate = interestRate
        return account
    }
}
interface IBuilder{
    fun build(): CuentaBancaria
}

class CuentaBancaria (){
    internal var accountNumber: Long = 0
    internal var owner: String? = null
    internal var balance = 0.0
    internal var interestRate = 0.0

    fun CuentaBancaria() {}

    fun getAccountNumber(): Long {return accountNumber}
    fun setAccountNumber(accountNumber: Long) {this.accountNumber = accountNumber}
    fun getOwner(): String? {return owner}
    fun setOwner(owner: String?) {this.owner = owner}
    fun getBalance(): Double {return balance}
    fun setBalance(balance: Double) {this.balance = balance}
    fun getInterestRate(): Double {return interestRate}
    fun setInterestRate(interestRate: Double) {this.interestRate = interestRate}

    override fun toString(): String {
        return "Cuenta Bancaria" +
                "\n Numero de cuenta= " + accountNumber +
                "\n Propietario de la cuenta= " + owner +
                "\n Fondos= " + balance +
                "\n Tasa de interes= " + interestRate
    }

}
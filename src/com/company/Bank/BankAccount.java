package com.company.Bank;

public class BankAccount {
    private long accountNumber;
    private String owner;
    private double balance;
    private double interestRate;

    public BankAccount() {}

    public long getAccountNumber() {
    return accountNumber;
}
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getInterestRate() {return interestRate;}
    public void setInterestRate(double interestRate) {this.interestRate = interestRate;}

    @Override
    public String toString() {
        return "Cuenta Bancaria" +
                "\n Numero de cuenta= " + accountNumber +
                "\n Propietario de la cuenta= " + owner +
                "\n Fondos= " + balance +
                "\n Tasa de interes= " + interestRate;
    }
}

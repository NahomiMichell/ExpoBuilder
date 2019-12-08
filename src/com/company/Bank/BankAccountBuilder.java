package com.company.Bank;

public class BankAccountBuilder implements IBuilder {
    private long accountNumber; //This is important, so we'll pass it to the constructor.
    private String owner;
    private double balance;
    private double interestRate;

    public BankAccountBuilder(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountBuilder withOwner(String owner){
        this.owner = owner;
        return this;  //By returning the builder each time, we can create a fluent interface.
    }

    public BankAccountBuilder withBalance(double balance){
        this.balance = balance;
        return this;
    }

    public BankAccountBuilder withRate(double interestRate){
        this.interestRate = interestRate;
        return this;
    }

    @Override
    public BankAccount build(){
        BankAccount account = new BankAccount();
        account.setAccountNumber(this.accountNumber);
        account.setOwner(this.owner);
        account.setBalance(this.balance);
        account.setInterestRate(this.interestRate);
        return account;
    }
}

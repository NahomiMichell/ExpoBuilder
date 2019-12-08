package com.company;
import com.company.Bank.BankAccountBuilder;
import com.company.Bank.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccountBuilder builder = new BankAccountBuilder(12345l);

        BankAccount bankAccount = builder.withBalance(1000.20)
                .withOwner("Nahomi Michell")
                .withRate(10.15)
                .build();
        System.out.println(bankAccount);
}
}

package com.pluralsight;

public abstract class BankAccount implements IValuable {

    public String name;
    public String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }


}

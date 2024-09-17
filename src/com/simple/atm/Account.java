package com.simple.atm;

public class Account implements Transactions {

    // feature to auto increment account number
    private static int nextAccountNumber = 1001;

    private final int accountNumber;
    private int pin;
    private double balance;

    public Account(double bal, int pin) {
        this.balance = bal;
        this.pin = pin;

        accountNumber = getNextAccountNumber();
    }

    public static int getNextAccountNumber() {
        int acctNo = nextAccountNumber;
        nextAccountNumber++;
        return acctNo;
    }

    public boolean validatePin(int p) {
        if (this.pin == p) {
            return true;
        }
        System.out.println("Invalid pin");
        return false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean withdraw(double debitAmt) {
        if (debitAmt > this.balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        balance -= debitAmt;
        System.out.println("Please remove your card and money.");
        return true;
    }

    @Override
    public boolean deposit(double creditAmt) {
        balance += creditAmt;
        System.out.println("Deposit successful.");
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

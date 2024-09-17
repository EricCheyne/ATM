package com.simple.atm;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(5000, 1423);

        System.out.println(account1.getBalance());
        account1.deposit(700);
        System.out.println(account1.getBalance());
        account1.withdraw(2000);
        System.out.println(account1.getBalance());
    }
}
package com.simple.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pinNum;
        int userOption = 0;

        Account account1 = new Account(5000, 1423);

        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM();

        pinNum = scanner.nextInt();

        if (account1.validatePin(pinNum)) {
            do {
                atm.menu();
                userOption = scanner.nextInt();
                switch (userOption) {
                    case 1:
                        atm.withdrawMenu();
                        double withdrawAmount = scanner.nextDouble();
                        account1.withdraw(withdrawAmount);
                        break;
                    case 2:
                        atm.depositMenu();
                        double depositAmount = scanner.nextDouble();
                        account1.deposit(depositAmount);
                        break;
                    case 3:
                        atm.balanceMenu(account1.getBalance());
                    case 4:
                        atm.exitMenu();
                        break;
                    default:
                        atm.invalidMessageMenu();
                        break;
                }
            } while (userOption != 4);
        }
    }
}
package com.zemosotraining.designpatterns.creational.Builder;

public class DriverClass {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.Builder(12345L)
                .atBranch("HayathNagar")
                .openingBalance(5000)
                .withOwner("Pragna")
                .atRate(5)
                .build();
        System.out.println(bankAccount);


        BankAccount bankAccount1 = new BankAccount.Builder(97987L).withOwner("Kumar").build();
        System.out.println(bankAccount1);

        BankAccount bankAccount2 = new BankAccount.Builder(75765L).atBranch("Madhapur").withOwner("Sai").build();
        System.out.println(bankAccount2);

        // BankAccount b = new BankAccount();

        //BankAccount b1 = new BankAccount.Builder().build();
    }
}

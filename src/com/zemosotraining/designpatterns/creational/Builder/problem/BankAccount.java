package com.zemosotraining.designpatterns.creational.Builder.problem;

public class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private String branch;
    private double balance;
    private double interestRate;

    public BankAccount(long accountNumber, String accountHolder, String branch, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.branch = branch;
        this.balance = balance;
        this.interestRate = interestRate;
    }
}

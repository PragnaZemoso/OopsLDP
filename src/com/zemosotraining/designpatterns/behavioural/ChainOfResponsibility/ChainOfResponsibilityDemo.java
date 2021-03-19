package com.zemosotraining.designpatterns.behavioural.ChainOfResponsibility;

import java.util.Scanner;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {

        CurrencyDispenserChain note2000_dispenser = new Note2000_Dispenser();
        CurrencyDispenserChain note500_Dispenser = new Note500_Dispenser();
        CurrencyDispenserChain note200_Dispenser = new Note200_Dispenser();
        CurrencyDispenserChain note100_Dispenser = new Note100_Dispenser();

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Enter amount to withdraw: ");
            int amount = scanner.nextInt();

            if (amount == 0)
                break;
            else if (amount % 100 != 0) {
                System.out.println("Please enter amount in multiples of 100");
            } else {
                System.out.println("----- 2000-500-200-100 Chain -----");
                ATMChain atmChain1 = new ATMChain(note2000_dispenser, note500_Dispenser, note200_Dispenser, note100_Dispenser);
                atmChain1.chain.dispenseMoney(new IndianCurrency(amount));

                System.out.println("----- 500-200-2000-100 Chain -----");
                ATMChain atmChain2 = new ATMChain(note500_Dispenser, note200_Dispenser, note2000_dispenser, note100_Dispenser);
                atmChain2.chain.dispenseMoney(new IndianCurrency(amount));

                System.out.println("----- 500-2000-100-200 Chain -----");
                ATMChain atmChain3 = new ATMChain(note500_Dispenser, note2000_dispenser, note100_Dispenser, note200_Dispenser);
                atmChain3.chain.dispenseMoney(new IndianCurrency(amount));

                System.out.println("----- 100-2000-500-200 Chain -----");
                ATMChain atmChain4 = new ATMChain(note100_Dispenser, note2000_dispenser, note500_Dispenser, note200_Dispenser);
                atmChain4.chain.dispenseMoney(new IndianCurrency(amount));
            }
        }
    }
}

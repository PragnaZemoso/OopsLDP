package com.zemosotraining.designpatterns.behavioural.ChainOfResponsibility;

/**
 * IndianCurrency - stores 'amount' to dispense
 * used by 'CurrencyDispenserChain' chain implementations
 */
public class IndianCurrency {
    int amount;

    public IndianCurrency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}


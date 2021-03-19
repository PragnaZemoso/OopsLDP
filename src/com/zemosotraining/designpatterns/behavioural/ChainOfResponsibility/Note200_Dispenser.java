package com.zemosotraining.designpatterns.behavioural.ChainOfResponsibility;

public class Note200_Dispenser extends CurrencyDispenserChain {

    @Override
    public void dispenseMoney(IndianCurrency currency) {
        int amount = currency.getAmount();
        dispenseNotes(currency, amount, 200);
    }
}
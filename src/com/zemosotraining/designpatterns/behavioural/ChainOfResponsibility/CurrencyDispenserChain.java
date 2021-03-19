package com.zemosotraining.designpatterns.behavioural.ChainOfResponsibility;

public abstract class CurrencyDispenserChain {
    CurrencyDispenserChain chain;

    /**
     * determines No. of Notes of noteValue(100,200,500,2000) to be dispensed
     *
     * @param currency
     * @param amount
     * @param noteValue
     */
    public void dispenseNotes(IndianCurrency currency, int amount, int noteValue) {
        if (amount >= noteValue) {
            int count = amount / noteValue;
            int remainingAmount = amount % noteValue;
            System.out.println("dispensing " + count + " notes of Rs." + noteValue);
            if (remainingAmount != 0)
                this.chain.dispenseMoney(new IndianCurrency(remainingAmount));
            else
                System.out.println("SUCCESS! Completed dispensing Amount");
        } else
            this.chain.dispenseMoney(currency);
    }

    /**
     * defines the next processor in the chain
     *
     * @param nextChainProcessor
     */
    public void setNextChain(CurrencyDispenserChain nextChainProcessor) {
        this.chain = nextChainProcessor;
    }

    /**
     * method that will process the request
     *
     * @param currency
     */
    abstract void dispenseMoney(IndianCurrency currency);
}

package com.zemosotraining.designpatterns.behavioural.ChainOfResponsibility;

public class ATMChain {
    public CurrencyDispenserChain chain;
    CurrencyDispenserChain dispenser2;
    CurrencyDispenserChain dispenser3;
    CurrencyDispenserChain dispenser4;


    /**
     * set the chain of responsibility in the order of dispenser1-dispenser2-dispenser3-dispenser4
     *
     * @param dispenser1 - CurrencyDispenserChain's implementation class's object
     * @param dispenser2 - CurrencyDispenserChain's implementation class's object
     * @param dispenser3 - CurrencyDispenserChain's implementation class's object
     * @param dispenser4 - CurrencyDispenserChain's implementation class's object
     */
    public ATMChain(CurrencyDispenserChain dispenser1, CurrencyDispenserChain dispenser2, CurrencyDispenserChain dispenser3, CurrencyDispenserChain dispenser4) {
        this.chain = dispenser1;
        this.dispenser2 = dispenser2;
        this.dispenser3 = dispenser3;
        this.dispenser4 = dispenser4;

        this.chain.setNextChain(this.dispenser2);
        this.dispenser2.setNextChain(this.dispenser3);
        this.dispenser3.setNextChain(this.dispenser4);

    }
}

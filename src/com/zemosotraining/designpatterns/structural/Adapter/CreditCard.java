package com.zemosotraining.designpatterns.structural.Adapter;

// this is the target interface - which will be used by the clients.
public interface CreditCard {
    public void giveBankDetails();

    public String getCreditCard();
}

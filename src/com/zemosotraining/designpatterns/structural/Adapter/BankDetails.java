package com.zemosotraining.designpatterns.structural.Adapter;

// This is the Adaptee class - used by the Adapter class to reuse the existing functionality and modify them for desired use.

public class BankDetails {

    private String accHolderName;
    private long accNumber;
    private String bankName;

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}

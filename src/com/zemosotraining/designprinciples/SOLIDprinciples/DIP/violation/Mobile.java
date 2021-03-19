package com.zemosotraining.designprinciples.SOLIDprinciples.DIP.violation;

// concrete class
public class Mobile {
    long mobileNumber;
    private long IMEI1, IMEI2;

    public void dial(long number){

        this.mobileNumber = number;
        System.out.println(this.getClass() + " - Dialling "  + mobileNumber);
    }
}

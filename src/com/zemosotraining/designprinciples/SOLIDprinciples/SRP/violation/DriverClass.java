package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.violation;

public class DriverClass {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile(725916963963889L, 725916963963239L, 9876543210L,
                9785642345L, "Oppo");
        Mobile mobile2 = new Mobile(725911263963889L, 985916963963239L, 9876543211L,
                9785642346L, "Mi A3");
        long number1 = mobile1.getSecondaryMobileNumber();
        long number2 = mobile2.getPrimaryMobileNumber();
        mobile1.dial(number1, number2);

        mobile1.sendMessage(number1, number2, "This is SRP violation");
        mobile2.sendMessage(number1, number2, "Lets give solution");
    }
}
package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution;

public class DriverClass {
    public static void main(String[] args) {

        MobileDialler caller = new MobileDialler(725916963963889L, 725916963963239L,
                9876543210L, 9785642345L, "Oppo");
        MobileDialler receiver = new MobileDialler(725916963963881L, 725916963963231L,
                9876543211L, 9785642346L, "Mi A3");
        long mobileNumber1 = caller.getPrimaryMobileNumber();
        long mobileNumber2 = receiver.getSecondaryMobileNumber();
        caller.dial(mobileNumber1, mobileNumber2);

        MobileMessenger sender = new MobileMessenger(825916963963889L, 825916963963239L,
                8876543210L, 8785642345L, "Oppo",
                "Hi, I am Pragna - ZeMoSo ASE intern");
        MobileMessenger msgReceiver = new MobileMessenger(825916963963881L, 825916963963231L,
                7876543210L, 7785642345L, "Mi A3",
                "");
        long number1 = sender.getSecondaryMobileNumber();
        long number2 = msgReceiver.getSecondaryMobileNumber();
        sender.sendMessage(number1, number2, sender.getMessage());
    }
}

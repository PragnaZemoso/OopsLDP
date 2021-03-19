package com.zemosotraining.designprinciples.SOLIDprinciples.OCP.solution;

public class DriverClass {
    public static void main(String[] args) {
        MobileWithTripleSimSlots tripleSimMobile = new MobileWithTripleSimSlots(725916963963240L, 725916963963239L,
                9876543210L, 9876543210L, "Mi A3", 725916963963223L, 9876543213L);
        System.out.println("IMEI Number of 3rd SIM slot: " + tripleSimMobile.getIMEI3());
        System.out.println("Third NUmber: " + tripleSimMobile.getTernaryNumber());
    }
}

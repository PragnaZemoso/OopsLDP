package com.zemosotraining.designprinciples.SOLIDprinciples.ISP.violation;

public class DriverClass {

    public static void main(String[] args) {
        String appName = "Cliq";
        Samsung samsung = new Samsung();
        samsung.downloadApplication(appName);

        AppleIPhoneX iPhoneX = new AppleIPhoneX();
        iPhoneX.downloadApplication(appName);
    }
}

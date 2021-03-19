package com.zemosotraining.designprinciples.SOLIDprinciples.LSP.violation;

public class DriverClass {

    public static void main(String[] args) {
        String appName = "Cliq";
        Samsung samsung = new Samsung();
        samsung.downloadApplication(appName);

        AppleIPhoneX iPhoneX = new AppleIPhoneX();
        iPhoneX.downloadApplication(appName);

        Nokia1100 nokia = new Nokia1100();
        nokia.downloadApplication(appName);
    }
}

package com.zemosotraining.designprinciples.SOLIDprinciples.LSP.solution;

public class DriverClass {
    public static void main(String[] args) {
        String appName = "Instagram";
        Samsung samsung = new Samsung();
        samsung.downloadApplication(appName);

        System.out.println("----------------------------------------");
        AppleIPhoneX iPhoneX = new AppleIPhoneX();
        iPhoneX.downloadApplication(appName);

        System.out.println("----------------------------------------");
        Nokia1110 nokia1110 = new Nokia1110();
        nokia1110.getMobileDescription();
//        nokia1110.downloadApplication(appName);

    }
}

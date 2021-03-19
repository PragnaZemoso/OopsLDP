package com.zemosotraining.designprinciples.SOLIDprinciples.ISP.violation;

// Client: Android Client???
public interface SmartMobile {
    void downloadApplication(String appName);
    void searchForApplication(String appName);
}

class Samsung implements SmartMobile{

    @Override
    public void downloadApplication(String appName) {
        searchForApplication(appName);
        System.out.println("Downloading Application '" + appName + "' from *GooglePlayStore* " + this.getClass());
    }

    @Override
    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from *GooglePlayStore* " + this.getClass());
    }
}

class AppleIPhoneX implements SmartMobile{
    @Override
    public void downloadApplication(String appName) {
        searchForApplication(appName);
        System.out.println("Downloading Application '" + appName + "' from *AppleAppStore* " + this.getClass());
    }

    @Override
    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from *AppleAppStore* " + this.getClass());
    }
}
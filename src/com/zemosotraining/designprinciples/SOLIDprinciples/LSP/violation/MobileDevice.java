package com.zemosotraining.designprinciples.SOLIDprinciples.LSP.violation;

public class MobileDevice {
    String application;

    public void downloadApplication(String appName) {
        this.application = appName;
        searchForApplication(application);
        System.out.println("Downloading Application '" + application + "' from " + this.getClass());
    }

    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from " + this.getClass());
    }
}

class Samsung extends MobileDevice {
    @Override
    public void downloadApplication(String appName) {
        this.application = appName;
        searchForApplication(application);
        System.out.println("Downloading Application '" + application + "' from *GooglePlayStore* " + this.getClass());
    }

    @Override
    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from *GooglePlayStore* " + this.getClass());
    }
}

class AppleIPhoneX extends MobileDevice {
    @Override
    public void downloadApplication(String appName) {
        this.application = appName;
        searchForApplication(application);
        System.out.println("Downloading Application '" + application + "' from *AppleAppStore* " + this.getClass());
    }

    @Override
    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from *AppleAppStore* " + this.getClass());
    }
}

class Nokia1100 extends MobileDevice {

    // Nokia1100 cannot download application
}
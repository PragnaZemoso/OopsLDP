package com.zemosotraining.designprinciples.SOLIDprinciples.ISP.solution;

// interfaces segregated based on OS type - AndroidMobile & AppleMobile
public interface AppleMobile {
    void downloadApplicationFromAppStore(String appName);
    void searchForApplication(String appName);

}

class AppleIPhoneX implements AppleMobile {
    @Override
    public void downloadApplicationFromAppStore(String appName) {
        searchForApplication(appName);
        System.out.println("Downloading Application '" + appName + "' from *AppleAppStore* " + this.getClass());
    }

    @Override
    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from *AppleAppStore* " + this.getClass());
    }
}

class DriverClassApple {
    public static void main(String[] args) {
        String appName = "Cliq";
        AppleIPhoneX iPhoneX = new AppleIPhoneX();
        iPhoneX.downloadApplicationFromAppStore("Cliq");
    }
}

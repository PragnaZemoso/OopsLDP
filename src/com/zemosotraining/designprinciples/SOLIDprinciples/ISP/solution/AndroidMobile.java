package com.zemosotraining.designprinciples.SOLIDprinciples.ISP.solution;

// interfaces segregated based on OS type - AndroidMobile & AppleMobile
public interface AndroidMobile {
    void downloadApplicationFromPlayStore(String appName);
    void searchForApplication(String appName);
}

class Samsung implements AndroidMobile {

    @Override
    public void downloadApplicationFromPlayStore(String appName) {
        searchForApplication(appName);
        System.out.println("Downloading Application '" + appName + "' from *GooglePlayStore* " + this.getClass());
    }

    @Override
    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from *GooglePlayStore* " + this.getClass());
    }

}

class DriverClassAndroid {
    public static void main(String[] args) {
        String appName = "Cliq";
        Samsung samsung = new Samsung();
        samsung.downloadApplicationFromPlayStore(appName);
    }
}

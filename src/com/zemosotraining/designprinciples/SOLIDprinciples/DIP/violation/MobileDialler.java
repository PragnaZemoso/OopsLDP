package com.zemosotraining.designprinciples.SOLIDprinciples.DIP.violation;

// MobileDialler - High Level Class
public class MobileDialler {
    private Mobile mobile;

    public MobileDialler(Mobile mobile) {
        this.mobile = mobile;
    }

    public void callMobile() {
        mobile.dial(8989786889L);
    }
}

class DriverClass {
    public static void main(String[] args) {
        MobileDialler mobileDialler = new MobileDialler(new Mobile());
        mobileDialler.callMobile();
    }
}
package com.zemosotraining.designprinciples.SOLIDprinciples.DIP.solution;

public interface IMobile {
    public void dial(long number);
}

class Mobile implements IMobile{
    private long IMEI1, IMEI2;
    long mobileNumber;
    @Override
    public void dial(long number) {
        this.mobileNumber = number;
        System.out.println(this.getClass() + " - Dialling "  + mobileNumber);
    }
}

class NormalMobile implements IMobile{
    private long IMEI1, IMEI2;
    long mobileNumber;
    @Override
    public void dial(long number) {
        this.mobileNumber = number;
        System.out.println(this.getClass() + " - Dialling from Normal "  + mobileNumber);
    }
}

class MobileDialler {
    private IMobile mobile;

    public MobileDialler(IMobile mobile) {
        this.mobile = mobile;
    }

    public void callMobile() {
        mobile.dial(8989786889L);
    }
}

class DriverClass{
    public static void main(String[] args) {
        MobileDialler mobileDialler = new MobileDialler(new Mobile());
        mobileDialler.callMobile();

        MobileDialler mobDialler = new MobileDialler(new NormalMobile());
        mobDialler.callMobile();
    }
}
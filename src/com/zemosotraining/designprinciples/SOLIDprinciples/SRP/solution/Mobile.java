package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution;

public class Mobile {

    private long IMEI1, IMEI2; // each for each SIM slot 1 & 2 respectively
    private long primaryMobileNumber, secondaryMobileNumber;
    private String deviceName;

    public Mobile(long IMEI1, long IMEI2, long primaryMobileNumber, long secondaryMobileNumber, String deviceName) {
        this.IMEI1 = IMEI1;
        this.IMEI2 = IMEI2;
        this.primaryMobileNumber = primaryMobileNumber;
        this.secondaryMobileNumber = secondaryMobileNumber;
        this.deviceName = deviceName;
    }

    // getters & setters

    public long getIMEI1() {
        return IMEI1;
    }

    public void setIMEI1(long IMEI1) {
        this.IMEI1 = IMEI1;
    }

    public long getIMEI2() {
        return IMEI2;
    }

    public void setIMEI2(long IMEI2) {
        this.IMEI2 = IMEI2;
    }

    public long getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public void setPrimaryMobileNumber(long primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
    }

    public long getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }

    public void setSecondaryMobileNumber(long secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}

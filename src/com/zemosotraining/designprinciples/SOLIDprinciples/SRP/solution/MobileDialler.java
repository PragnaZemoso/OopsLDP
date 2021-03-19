package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution;
/*
 * Example for S - Single Responsibility principle:
 * A class should only have one responsibility or one job. Furthermore, it should only have one reason to change.
 */

public class MobileDialler extends Mobile {

    public MobileDialler(long IMEI1, long IMEI2, long primaryMobileNumber, long secondaryMobileNumber, String deviceName) {
        super(IMEI1, IMEI2, primaryMobileNumber, secondaryMobileNumber, deviceName);
    }

    void dial(long mobileNumber1, long mobileNumber2) {
        // logic for dialing a mobile number
        System.out.println("From " + mobileNumber1 + ", Attempting to dial the Mobile " + mobileNumber2);
    }
}
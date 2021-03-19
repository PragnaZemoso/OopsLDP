package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution;
/*
 * Example for S - Single Responsibility principle:
 * A class should only have one responsibility or one job. Furthermore, it should only have one reason to change.
 */

public class MobileMessenger extends Mobile {

    private String message;

    public MobileMessenger(long IMEI1, long IMEI2, long primaryMobileNumber, long secondaryMobileNumber, String deviceName, String message) {
        super(IMEI1, IMEI2, primaryMobileNumber, secondaryMobileNumber, deviceName);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    void sendMessage(long mobileNumber1, long mobileNumber2, String message) {
        // logic for sending message
        System.out.println("Sending message '" + message + "' from " + mobileNumber1 + " to mobile " + mobileNumber2);
    }

}
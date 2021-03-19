package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceLSP.LSP1;

/*
 * Example for The Liskov substitution principle which states that
 * functions that reference base classes must be able to use objects of derived (child) classes without knowing it.
 * i.e., Derived or child classes must be substitutable for their base or parent classes
 */

public class TransportationDevice {

    public String deviceName;
    double mileage;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    /*
     * Methods for TransportationDevice types:
     * MotoredVehicle - startEngine() Ex: Car
     * Non-Motored - startMoving() Ex: Bicycle
     */

}

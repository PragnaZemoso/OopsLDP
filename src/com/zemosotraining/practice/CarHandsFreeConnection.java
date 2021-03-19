package com.zemosotraining.practice;

public class CarHandsFreeConnection {
    BluetoothCapableMobile phone;

    void pairWithPhone(BluetoothCapableMobile phone){
        this.phone = phone;
    }

    public void acceptCall() {
        this.phone.acceptCall();
    }

    public void declineCall() {
        this.phone.declineCall();
    }

    public static void main(String[] args) {
        CarHandsFreeConnection car = new CarHandsFreeConnection();
        System.out.println("----------- Connecting Apple Mobile to Car through Bluetooth --------------");
        AppleMobile apple = new AppleMobile();
        car.pairWithPhone(apple);
        car.acceptCall();
        car.declineCall();

        System.out.println("----------- Connecting Android Mobile to Car through Bluetooth --------------");
        AndroidMobile android = new AndroidMobile();
        car.pairWithPhone(android);
        car.acceptCall();
        car.declineCall();
    }

}
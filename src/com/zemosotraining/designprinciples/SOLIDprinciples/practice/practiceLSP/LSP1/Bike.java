package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceLSP.LSP1;
/*
 * Example for The Liskov substitution principle which states that
 * functions that reference base classes must be able to use objects of derived (child) classes without knowing it.
 * i.e., Derived or child classes must be substitutable for their base or parent classes
 */

public class Bike extends EnginedDevice{

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Hey! Its Engined Device - BIKE " + this.getClass());
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.startEngine();
    }

}
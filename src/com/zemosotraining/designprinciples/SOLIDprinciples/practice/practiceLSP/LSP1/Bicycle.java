package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceLSP.LSP1;
/*
 * Example for The Liskov substitution principle which states that
 * functions that reference base classes must be able to use objects of derived (child) classes without knowing it.
 * i.e., Derived or child classes must be substitutable for their base or parent classes
 */

public class Bicycle extends NonEnginedDevice{

    @Override
    void startMoving() {
        super.startMoving();
        System.out.println("Hey! Its Non engined Transportation Device - " + this.getClass() );
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.startMoving();
    }

}
package com.zemosotraining.designpatterns.behavioural.Template;

public class ClassicCar extends CarTemplate {
    @Override
    protected void fixChassis() {
        System.out.println("Assembling chassis of the classical model");
        this.chassis = "Classic Chassis";
    }

    @Override
    protected void fixBody() {
        System.out.println("Assembling body of the classical model");
        this.body = "Classic Body";
    }

    @Override
    protected void fixInterior() {
        System.out.println("Setting up interior of the classical model");
        this.interior = "Classic interior";
    }
}

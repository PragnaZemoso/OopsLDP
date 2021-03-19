package com.zemosotraining.designpatterns.behavioural.Template;

public class SportsCar extends CarTemplate {
    @Override
    protected void fixChassis() {
        System.out.println("Assembling chassis of the sports model");
        this.chassis = "Sporty Chassis";
    }

    @Override
    protected void fixBody() {
        System.out.println("Assembling body of the sports model");
        this.body = "Sporty Body";
    }

    @Override
    protected void fixInterior() {
        System.out.println("Setting up interior of the sports model");
        this.interior = "Sporty interior";
    }
}

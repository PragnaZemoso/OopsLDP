package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceLSP.LSP1;
/*
 * Example for The Liskov substitution principle which states that
 * functions that reference base classes must be able to use objects of derived (child) classes without knowing it.
 * i.e., Derived or child classes must be substitutable for their base or parent classes
 */

public class EnginedDevice extends TransportationDevice implements Engine{

    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Starting the Engine");
    }
}


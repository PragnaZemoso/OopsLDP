package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceISP.violation;

public class Swimmer implements Athlete {

    @Override
    public void compete() {
        System.out.println("I have started competing...");
    }

    @Override
    public void swim() {
        System.out.println("Hey! I am a swimmer");
        compete();

    }

    @Override
    public void longJump() {
        System.out.println("I am a swimmer, but had to implement longJump method ._.");
    }

    @Override
    public void highJump() {
        System.out.println("I am a swimmer, but had to implement highJump method ._.");
    }

    @Override
    public void sprint() {
        System.out.println("I am a swimmer, but had to implement sprint method ._.");
    }
}


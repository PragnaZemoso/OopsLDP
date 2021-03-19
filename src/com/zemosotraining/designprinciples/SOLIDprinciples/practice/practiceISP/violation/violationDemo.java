package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceISP.violation;

public class violationDemo {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        swimmer.swim();

        swimmer.sprint();
        swimmer.longJump();
        swimmer.highJump();
    }
}

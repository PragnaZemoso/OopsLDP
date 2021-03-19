package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceLSP.solution;

public class LSPSolution {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        //ostrich.fly();
        System.out.println("--- Ostrich - subclass of Bird: ");
        ostrich.getBirdInfo();

        System.out.println("--- Sparrow - subclass of FlyingBird:");
        Sparrow sparrow = new Sparrow();
        sparrow.fly();

    }
}

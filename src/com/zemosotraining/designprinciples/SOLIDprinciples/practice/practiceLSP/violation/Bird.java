package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceLSP.violation;

public class Bird {

    void fly(){
        System.out.println("Hey, I am a Bird & I am flying");
    }
}

class Sparrow extends Bird{

}

class Ostrich extends Bird{
    // BUt can't fly
}

class LSPViolation{
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        ostrich.fly();


    }
}
package com.zemosotraining.designprinciples.SOLIDprinciples.practice.practiceLSP.solution;

public class Bird {

    public void getBirdInfo(){
        System.out.println("Its me Bird!!");
    }

}

class FlyingBird extends Bird{
    void fly(){
        System.out.println("Hey, I am a Bird & I am flying");
    }
}
class Sparrow extends FlyingBird {

}

class Ostrich extends Bird {
    // BUt can't fly
}

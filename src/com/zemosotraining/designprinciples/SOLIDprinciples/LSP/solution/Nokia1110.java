package com.zemosotraining.designprinciples.SOLIDprinciples.LSP.solution;

public class Nokia1110 extends NormalPhone{

    @Override
    public void getMobileDescription() {
        System.out.println("Its NOKIA 1110");
        super.getMobileDescription();
    }
}

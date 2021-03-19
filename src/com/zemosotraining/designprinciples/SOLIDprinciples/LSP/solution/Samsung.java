package com.zemosotraining.designprinciples.SOLIDprinciples.LSP.solution;

public class Samsung extends SmartPhone{

    @Override
    public void getMobileDescription() {
        System.out.println("It's Samsung & so:");
        super.getMobileDescription();
    }
}
